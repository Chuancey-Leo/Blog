package com.leo.service;

import java.util.List;
import java.util.Map;

import com.leo.entity.Link;

/**
 * ����service�ӿ�
 * @author liao
 *
 */
public interface LinkService {
	
	/**
	 * ��������������Ϣ
	 * @param map
	 * @return
	 */
	public List<Link> list(Map<String, Object> map);
} 
