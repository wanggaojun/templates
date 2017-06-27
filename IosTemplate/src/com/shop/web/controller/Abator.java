package com.shop.web.controller;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.abator.api.GeneratedJavaFile;
import org.apache.ibatis.abator.api.GeneratedXmlFile;
import org.apache.ibatis.abator.api.ProgressCallback;
import org.apache.ibatis.abator.api.ShellCallback;
import org.apache.ibatis.abator.config.AbatorConfiguration;
import org.apache.ibatis.abator.config.AbatorContext;
import org.apache.ibatis.abator.exception.InvalidConfigurationException;
import org.apache.ibatis.abator.exception.ShellException;
import org.apache.ibatis.abator.internal.DefaultShellCallback;
import org.apache.ibatis.abator.internal.NullProgressCallback;
import org.apache.ibatis.abator.internal.XmlFileMergerJaxp;
import org.apache.ibatis.abator.internal.util.messages.Messages;

public class Abator
{
  private AbatorConfiguration abatorConfiguration;
  private ShellCallback shellCallback;
  private List generatedJavaFiles;
  private List generatedXmlFiles;
  private List warnings;
  private Set projects;

  public Abator(AbatorConfiguration abatorConfiguration, ShellCallback shellCallback, List warnings)
  {
    if (abatorConfiguration == null) {
      throw new IllegalArgumentException(Messages.getString("RuntimeError.2"));
    }
    this.abatorConfiguration = abatorConfiguration;

    if (shellCallback == null)
      this.shellCallback = new DefaultShellCallback(false);
    else {
      this.shellCallback = shellCallback;
    }

    if (warnings == null)
      this.warnings = new ArrayList();
    else {
      this.warnings = warnings;
    }
    this.generatedJavaFiles = new ArrayList();
    this.generatedXmlFiles = new ArrayList();
    this.projects = new HashSet();
  }

  public void generate(ProgressCallback callback)
    throws InvalidConfigurationException, SQLException, IOException, InterruptedException
  {
    if (callback == null) {
      callback = new NullProgressCallback();
    }

    this.generatedJavaFiles.clear();
    this.generatedXmlFiles.clear();

    int totalSteps = 0;
    totalSteps++;

    Iterator iter = this.abatorConfiguration.getAbatorContexts().iterator();
    while (iter.hasNext()) {
      AbatorContext abatorContext = (AbatorContext)iter.next();

      totalSteps += abatorContext.getTotalSteps();
    }

    callback.setNumberOfSubTasks(totalSteps);

    callback.startSubTask(Messages.getString("Progress.2"));
    this.abatorConfiguration.validate();

    iter = this.abatorConfiguration.getAbatorContexts().iterator();
    while (iter.hasNext()) {
      AbatorContext abatorContext = (AbatorContext)iter.next();

      abatorContext.generateFiles(callback, this.generatedJavaFiles, this.generatedXmlFiles, this.warnings);
    }

    iter = this.generatedXmlFiles.iterator();
    while (iter.hasNext()) {
      GeneratedXmlFile gxf = (GeneratedXmlFile)iter.next();
      this.projects.add(gxf.getTargetProject());
      String source = null;
      File targetFile = null;
      try
      {
        File directory = this.shellCallback.getDirectory(gxf.getTargetProject(), gxf.getTargetPackage(), this.warnings);

        targetFile = new File(directory, gxf.getFileName());
        
        if (targetFile.exists())
          source = XmlFileMergerJaxp.getMergedSource(gxf, targetFile);
        else
          source = gxf.getFormattedContent();
      }
      catch (ShellException e)
      {
        this.warnings.add(e.getMessage());
      }
      writeFile(targetFile, source);
    }

    iter = this.generatedJavaFiles.iterator();
    while (iter.hasNext()) {
      GeneratedJavaFile gjf = (GeneratedJavaFile)iter.next();
      this.projects.add(gjf.getTargetProject());
      try
      {
        File directory = this.shellCallback.getDirectory(gjf.getTargetProject(), gjf.getTargetPackage(), this.warnings);

        File targetFile = new File(directory, gjf.getFileName());
        String source;
        if (targetFile.exists())
        {
          if (this.shellCallback.mergeSupported()) {
            source = this.shellCallback.mergeJavaFile(gjf, "@abatorgenerated", this.warnings);
          }
          else {
           source = gjf.getFormattedContent();
            targetFile = getUniqueFileName(directory, gjf);
            this.warnings.add(Messages.getString("Warning.2", targetFile.getAbsolutePath()));
          }
        } else {
          source = gjf.getFormattedContent();
        }

        writeFile(targetFile, source);
      } catch (ShellException e) {
        this.warnings.add(e.getMessage());
      }
    }

    iter = this.projects.iterator();
    while (iter.hasNext())
      this.shellCallback.refreshProject((String)iter.next());
  }

  private void writeFile(File file, String content)
    throws IOException
  {
    BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));
    bw.write(content);
    bw.close();
  }

  private File getUniqueFileName(File directory, GeneratedJavaFile gjf) {
    File answer = null;

    StringBuffer sb = new StringBuffer();
    for (int i = 1; i < 10000; i++) {
      sb.setLength(0);
      sb.append(gjf.getFileName());
      sb.append('.');
      sb.append(i);

      File testFile = new File(directory, sb.toString());
      if (!testFile.exists()) {
        answer = testFile;
        break;
      }
    }

    if (answer == null) {
      throw new RuntimeException(Messages.getString("RuntimeError.3", directory.getAbsolutePath()));
    }

    return answer;
  }
}