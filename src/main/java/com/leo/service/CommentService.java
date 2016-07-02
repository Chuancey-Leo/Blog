package com.leo.service;

import java.util.List;
import java.util.Map;

import com.leo.entity.Comment;

public interface CommentService {

	public List<Comment> list(Map<String, Object> map);
	public int add(Comment comment);
	public Long getTotal(Map<String,Object> map);
}
