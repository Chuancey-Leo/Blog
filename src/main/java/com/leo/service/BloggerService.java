package com.leo.service;

import java.util.List;
import java.util.Map;

import com.leo.entity.Blog;
import com.leo.entity.Blogger;

/**
 * ����service�ӿ�
 * @author liao
 *
 */
public interface BloggerService {
	public Blogger getByUserName(String userName);
	
	public Blogger find();
	public Integer update(Blogger blogger);
	

} 
