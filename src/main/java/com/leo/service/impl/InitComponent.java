package com.leo.service.impl;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.leo.entity.Blog;
import com.leo.entity.BlogType;
import com.leo.entity.Blogger;
import com.leo.entity.Link;
import com.leo.service.BlogService;
import com.leo.service.BlogTypeService;
import com.leo.service.BloggerService;
import com.leo.service.LinkService;

@Component
public class InitComponent implements ServletContextListener,ApplicationContextAware{

	private static ApplicationContext applicationContext;
	
	public void contextInitialized(ServletContextEvent sce) {
//		ServletContext application=sce.getServletContext();
//		BloggerService bloggerService=(BloggerService) applicationContext.getBean("bloggerService");
//		Blogger blogger=bloggerService.find(); // ��ȡ������Ϣ
//		blogger.setPassword(null);
//		application.setAttribute("blogger", blogger);
//		
//		LinkService linkService=(LinkService) applicationContext.getBean("linkService");
//		List<Link> linkList=linkService.list(null); // ��ѯ���е�����������Ϣ
//		application.setAttribute("linkList", linkList);
//		
//		BlogTypeService blogTypeService=(BlogTypeService) applicationContext.getBean("blogTypeService");
//		List<BlogType> blogTypeCountList=blogTypeService.countList(); // ��ѯ��������Լ����͵�����
//		application.setAttribute("blogTypeCountList", blogTypeCountList);
//		
//		BlogService blogService=(BlogService) applicationContext.getBean("blogService");
//		List<Blog> blogCountList=blogService.countList(); // �������ڷ����ѯ����
//		application.setAttribute("blogCountList", blogCountList);
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
	}

}
