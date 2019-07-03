package com.example.demo.model.condition;

public class PagingCondition {

	protected int pageNum;
	
	protected int pageSize;

	public int getPageNum() {
		return pageNum == 0 ? 1 : pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize == 0 ? 10 : pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
