package com.leo.dao;

import java.util.List;
import java.util.Map;

import com.leo.entity.BlogType;

/**
 * ����־���
 * @author liao
 *
 */
public interface BlogTypeDao {
	
	public List<BlogType> countList();
	
	/**
	 * ͨ��id���Ҳ���
	 * @param id
	 * @return
	 */
	public BlogType findById(Integer id);
	
	public List<BlogType> list(Map<String, Object> map);
	
	public Long getTotal(Map<String, Object> map);
	
	public Integer add(BlogType blogType);
	
	public Integer update(BlogType blogType);
	
	public Integer delete(Integer id);
}
