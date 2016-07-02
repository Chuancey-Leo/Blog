package com.leo.entity;

/**
 * 分页Model类
 * @author 
 *
 */
public class PageBean {

	private Integer page; // 第几页
	private Integer pageSize; // 每页记录数
	private Integer start;  // 起始页
	
	
	public PageBean(Integer page, Integer pageSize) {
		super();
		this.page = page;
		this.pageSize = pageSize;
	}
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	
	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getStart() {
		return (page-1)*pageSize;
	}
	
	
}
