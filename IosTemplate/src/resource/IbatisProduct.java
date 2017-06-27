package resource;



import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.apache.ibatis.abator.config.AbatorConfiguration;
import org.apache.ibatis.abator.config.xml.AbatorConfigurationParser;
import org.apache.ibatis.abator.exception.InvalidConfigurationException;
import org.apache.ibatis.abator.exception.XMLParserException;
import org.apache.ibatis.abator.internal.DefaultShellCallback;

import com.shop.web.controller.Abator;

public class IbatisProduct {

    public static void main(String[] args){
        List warnings = new ArrayList(); // Abator will add Strings to this
                                            // list
        boolean overwrite = true;
        File configFile = new File("abatorConfig.xml");
        AbatorConfigurationParser cp = new AbatorConfigurationParser(warnings);
        AbatorConfiguration config = null;
        try{
            config = cp.parseAbatorConfiguration(configFile);
        } catch (IOException e1){
            e1.printStackTrace();
        } catch (XMLParserException e1){
            e1.printStackTrace();
        }
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        Abator abator = new Abator(config, callback, warnings);
        try{
            abator.generate(null);
        } catch (InvalidConfigurationException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        
        System.exit(0);
    }
   
}