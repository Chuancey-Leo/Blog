package com.leo.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leo.dao.LinkDao;
import com.leo.entity.Link;
import com.leo.service.LinkService;


/**
 * ����serviceʵ����
 * @author liao
 *
 */

@Service("linkService")
public class LinkServiceImpl implements LinkService{
	
	//�Զ�ע��bean
	@Resource
	private LinkDao linkDao;

	public List<Link> list(Map<String, Object> map) {
		return linkDao.list(map);
	}
	
}
