package com.leo.entity;

/**
 * ��ҳModel��
 * @author 
 *
 */
public class PageBean {

	private Integer page; // �ڼ�ҳ
	private Integer pageSize; // ÿҳ��¼��
	private Integer start;  // ��ʼҳ
	
	
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
