package com.leo.dao;

import com.leo.entity.Blogger;

/**
 * ����Dao�ӿ�
 * @author liao
 *
 */
public interface BloggerDao {
	public Blogger getByUserName(String userName);
	
	public Blogger find();
	public Integer update(Blogger blogger);
}
