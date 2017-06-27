package com.shop.web.util;

import java.util.HashMap;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.ibatis.SqlMapClientTemplate;

import com.ibatis.sqlmap.engine.impl.SqlMapClientImpl;
import com.ibatis.sqlmap.engine.mapping.sql.Sql;
import com.ibatis.sqlmap.engine.mapping.statement.MappedStatement;
import com.ibatis.sqlmap.engine.scope.SessionScope;
import com.ibatis.sqlmap.engine.scope.StatementScope;

/**
 * iBatis分页类
 * 
 * @author Nanlei
 * 
 */
public class PagingList {
	private int rowCount = 0; // 记录总数
	private int pageCount = 1; // 分页总数
	private int pageSize = 10; // 每页记录数
	private int pageNum = 1; // 当前页数
	private int startIndex = 1; // 起始记录数
	private int endIndex = 1; // 结束记录数
	private List list;// 记录列表

	/**
	 * 构造方法，进行分页
	 * 
	 * @param statementName
	 *            iBatis中语句的ID
	 * @param parameterObject
	 *            SQL语句参数
	 * @param pageNum
	 *            起始页数
	 * @param pageSize
	 *            每页大小
	 * @param sqlMapClientTemplate
	 *            iBatis的sqlMapClientTemplate对象
	 */
	public PagingList(String statementName, Object parameterObject,
			int pageNum, int pageSize,
			SqlMapClientTemplate sqlMapClientTemplate, JdbcTemplate jdbcTemplate) {
		preProcessParams(pageNum, pageSize);
		execute(statementName, parameterObject, pageNum, pageSize,
				sqlMapClientTemplate, jdbcTemplate);
	}

	/**
	 * 构造方法，进行分页
	 * 
	 * @param statementName
	 *            iBatis中语句的ID
	 * @param pageNum
	 *            起始页数
	 * @param pageSize
	 *            每页大小
	 * @param sqlMapClientTemplate
	 *            iBatis的sqlMapClientTemplate对象
	 */
	public PagingList(String statementName, int pageNum, int pageSize,
			SqlMapClientTemplate sqlMapClientTemplate, JdbcTemplate jdbcTemplate) {
		preProcessParams(pageNum, pageSize);
		execute(statementName, pageNum, pageSize, sqlMapClientTemplate,
				jdbcTemplate);
	}

	/**
	 * 执行方法
	 * 
	 * @param statementName
	 * @param parameterObject
	 * @param pageNum
	 * @param pageSize
	 * @param sqlMapClientTemplate
	 */
	public void execute(String statementName, Object parameterObject,
			int pageNum, int pageSize,
			SqlMapClientTemplate sqlMapClientTemplate, JdbcTemplate jdbcTemplate) {
		// 计算记录总数
		this.rowCount = jdbcTemplate.queryForInt(
				getCountSql(getSrcSql(statementName, parameterObject,
						sqlMapClientTemplate)), ((HashMap) parameterObject)
						.values().toArray());
		System.out.println(rowCount);
		// 计算分页数及起止记录
		countPage();
		// 获取分页列表
		this.list = sqlMapClientTemplate.queryForList(statementName,
				parameterObject, (pageNum - 1) * pageSize, pageSize);
	}

	/**
	 * 执行方法
	 * 
	 * @param statementName
	 * @param pageNum
	 * @param pageSize
	 * @param sqlMapClientTemplate
	 */
	public void execute(String statementName, int pageNum, int pageSize,
			SqlMapClientTemplate sqlMapClientTemplate, JdbcTemplate jdbcTemplate) {
		// 计算记录总数
		this.rowCount = jdbcTemplate.queryForInt(getCountSql(getSrcSql(
				statementName, null, sqlMapClientTemplate)));
		System.out.println(rowCount);
		// 计算分页数及起止记录
		countPage();
		// 获取分页列表
		this.list = sqlMapClientTemplate.queryForList(statementName,
				(pageNum - 1) * pageSize, pageSize);
	}

	/**
	 * 预处理SQL语句和页面参数
	 */
	private void preProcessParams(int pageNum, int pageSize) {
		if (pageNum > 0) {
			this.pageNum = pageNum;
		}
		if (pageSize > 0) {
			this.pageSize = pageSize;
		}
		if (pageSize > 1000) {
			this.pageSize = 1000;
		}
	}

	/**
	 * 计算分页数及起止记录
	 */
	private void countPage() {
		// 计算分页总数
		if ((rowCount % pageSize) == 0) {
			pageCount = rowCount / pageSize;
		} else {
			pageCount = rowCount / pageSize + 1;
		}
		if (pageCount == 0) {
			pageCount = 1;
		}
		// 判断pageNum是否过界
		if (pageNum > pageCount && rowCount != 0) {
			pageNum = pageCount;
		}
		// 计算起止记录
		startIndex = (pageNum - 1) * pageSize + 1;
		endIndex = (pageNum) * pageSize;
	}

	/**
	 * 获得对象列表
	 */
	public List getList() {
		return list;
	}

	/* 获得起始记录数 */
	public int getStartIndex() {
		return startIndex;
	}

	public Integer getStartIndexInteger() {
		return new Integer(startIndex);
	}

	/* 获得结束记录数 */
	public int getEndIndex() {
		return endIndex;
	}

	public Integer getEndIndexInteger() {
		return new Integer(endIndex);
	}

	/* 获得分页其它信息 */
	public int getPageCount() {
		return pageCount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getRowCount() {
		return rowCount;
	}

	private String getSrcSql(String statementName, Object parameterObject,
			SqlMapClientTemplate sqlMapClientTemplate) {
		SqlMapClientImpl sqlMapClientImpl = (SqlMapClientImpl) sqlMapClientTemplate
				.getSqlMapClient();
		MappedStatement mappedStatement = sqlMapClientImpl
				.getMappedStatement(statementName);
		Sql sql = mappedStatement.getSql();
		StatementScope statementScope = new StatementScope(new SessionScope());
		String srcSql = sql.getSql(statementScope, parameterObject);
		return srcSql;
	}

	private String getCountSql(String srcSql) {
		return "SELECT COUNT(*) FROM ( " + srcSql + " ) CTBL_";
	}

}
