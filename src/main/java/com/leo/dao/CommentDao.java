package com.leo.dao;

import java.util.List;
import java.util.Map;

import com.leo.entity.Comment;

/**
 * ÆÀÂÛĞÅÏ¢
 * @author liao
 *
 */
public interface CommentDao {
	
	public List<Comment> list(Map<String, Object> map);
	public int add(Comment comment);
	public Long getTotal(Map<String,Object> map);
}
