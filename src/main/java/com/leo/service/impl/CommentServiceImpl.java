package com.leo.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leo.dao.CommentDao;
import com.leo.entity.Comment;
import com.leo.service.CommentService;

@Service("commentService")
public class CommentServiceImpl implements CommentService{
	
	@Resource
	private CommentDao commentDao;
	public List<Comment> list(Map<String, Object> map) {

		return commentDao.list(map);
	}
	public int add(Comment comment) {
		
		return commentDao.add(comment);
	}
	public Long getTotal(Map<String, Object> map) {
		
		return commentDao.getTotal(map);
	}

}
