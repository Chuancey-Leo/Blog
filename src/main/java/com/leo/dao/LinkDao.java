package com.leo.dao;

import java.util.List;
import java.util.Map;

import com.leo.entity.Link;

/**
 * ��������Dao�ӿ�
 * @author liao
 *
 */
public interface LinkDao {
	
	public List<Link> list(Map<String, Object> map);
}
