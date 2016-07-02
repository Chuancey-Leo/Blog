package com.leo.dao;

import java.util.List;
import java.util.Map;

import com.leo.entity.Link;

/**
 * 有情链接Dao接口
 * @author liao
 *
 */
public interface LinkDao {
	
	public List<Link> list(Map<String, Object> map);
}
