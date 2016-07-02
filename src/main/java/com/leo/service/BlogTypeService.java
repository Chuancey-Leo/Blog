package com.leo.service;

import java.util.List;
import java.util.Map;

import com.leo.entity.BlogType;
import com.leo.entity.Blogger;

/**
 * 博客类型service接口
 * @author liao
 *
 */
public interface BlogTypeService {
	public List<BlogType> countList();
	
	public BlogType findById(Integer id);
	
	public List<BlogType> list(Map<String, Object> map);
	
	public Long getTotal(Map<String, Object> map);
	
	public Integer add(BlogType blogType);
	
	public Integer update(BlogType blogType);
	
	public Integer delete(Integer id);
} 
