package com.leo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leo.dao.BloggerDao;
import com.leo.entity.Blogger;
import com.leo.service.BloggerService;

/**
 * ����serviceʵ����
 * @author liao
 *
 */

@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService{
	
	//�Զ�ע��bean
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
