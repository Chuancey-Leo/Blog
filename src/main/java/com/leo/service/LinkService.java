package com.leo.service;

import java.util.List;
import java.util.Map;

import com.leo.entity.Link;

/**
 * 链接service接口
 * @author liao
 *
 */
public interface LinkService {
	
	/**
	 * 查找友情链接信息
	 * @param map
	 * @return
	 */
	public List<Link> list(Map<String, Object> map);
} 
