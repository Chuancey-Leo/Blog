package com.leo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leo.dao.BloggerDao;
import com.leo.entity.Blogger;
import com.leo.service.BloggerService;

/**
 * 博主service实现类
 * @author liao
 *
 */

@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService{
	
	//自动注入bean
	@Resource
	private BloggerDao bloggerDao;
	public Blogger getByUserName(String userName) {
		return bloggerDao.getByUserName(userName);
	}
	public Blogger find() {
		return bloggerDao.find();
	}
	public Integer update(Blogger blogger) {
		return bloggerDao.update(blogger);
		
	}

	
}
