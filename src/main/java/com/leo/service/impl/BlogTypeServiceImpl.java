package com.leo.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leo.dao.BlogTypeDao;
import com.leo.dao.BloggerDao;
import com.leo.entity.BlogType;
import com.leo.entity.Blogger;
import com.leo.service.BlogTypeService;
import com.leo.service.BloggerService;

/**
 * 博主service实现类
 * @author liao
 *
 */

@Service("blogTypeService")
public class BlogTypeServiceImpl implements BlogTypeService{

	//自动注入bean
	@Resource
	public BlogTypeDao blogTypeDao;
	public List<BlogType> countList() {
		return blogTypeDao.countList();
	}
	public BlogType findById(Integer id) {
		return blogTypeDao.findById(id);
	}
	public List<BlogType> list(Map<String, Object> map) {
		
		return blogTypeDao.list(map);
	}
	public Long getTotal(Map<String, Object> map) {
		
		return blogTypeDao.getTotal(map);
	}
	public Integer add(BlogType blogType) {
		// TODO Auto-generated method stub
		return blogTypeDao.add(blogType);
	}
	public Integer update(BlogType blogType) {
		// TODO Auto-generated method stub
		return blogTypeDao.update(blogType);
	}
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		return blogTypeDao.delete(id);
	}
	


	
}
