package com.leo.entity;

/**
 * ��������ʵ��
 * @author liao
 *
 */
public class Link {
	private Integer id;
	private String linkName;
	private String linkUrl;
	private Integer orderNum;//����ǩ��ѭ������
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLinkName() {
		return linkName;
	}
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	public String getLinkUrl() {
		return linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	
	
	
}
