package com.leo.dao;

import java.util.List;
import java.util.Map;

import com.leo.entity.Blog;

/**
 * ²©¿ÍDAO
 * @author liao
 *
 */
public interface BlogDao {
	public List<Blog> countList();
	
	public List<Blog> list(Map<String, Object> map);
	
	public long getTotal(Map<String, Object> map);
	
	public Blog findById(Integer id);
	
	public Integer update(Blog blog);
	
	public Blog getLastBlog(Integer id);
	
	public Blog getNextBlog(Integer id);
	
	public Integer add(Blog blog);
	
	public Integer delete(Integer id);
}
