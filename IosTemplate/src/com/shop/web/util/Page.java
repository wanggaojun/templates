package com.shop.web.util;

import java.util.ArrayList;
import java.util.List;

public class Page {
	private long rowCount=0;//总记录数
	private long pageCount=0;//总页数
	private long rowCountPerPage=0;//每页显示的记录数
	private long curPageNum=1;//当前页码
	private List<?> result=new ArrayList<Object>();//当前页显示数据集合
	public long getCurPageNum() {
		return curPageNum;
	}
	public void setCurPageNum(long curPageNum) {
		this.curPageNum = curPageNum;
	}
	public long getPageCount() {
		return pageCount;
	}
	public void setPageCount(long pageCount) {
		this.pageCount = pageCount;
	}
	public List<?> getResult() {
		return result;
	}
	public void setResult(List<?> result) {
		this.result = result;
	}
	public long getRowCount() {
		return rowCount;
	}
	public void setRowCount(long rowCount) {
		this.rowCount = rowCount;
	}
	public long getRowCountPerPage() {
		return rowCountPerPage;
	}
	public void setRowCountPerPage(long rowCountPerPage) {
		this.rowCountPerPage = rowCountPerPage;
	}
}