package com.leo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leo.entity.Blog;
import com.leo.entity.BlogType;
import com.leo.entity.Blogger;
import com.leo.entity.Link;
import com.leo.service.BlogService;
import com.leo.service.BlogTypeService;
import com.leo.service.BloggerService;
import com.leo.service.LinkService;
import com.leo.util.CryptographyUtil;

/**
 * 博主Controller层
 * @author liao
 *
 */

@Controller
//表单提交时的action映射
@RequestMapping("/blogger")
public class BloggerController {
	@Resource
	private BlogService blogService;
	@Resource
	private BlogTypeService blogTypeService;
	@Resource
	private LinkService linkService;
	
	@RequestMapping("/login")
	public String login(Blogger blogger,HttpServletRequest request){
		Subject subject=SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(blogger.getUserName(), CryptographyUtil.md5(blogger.getPassword(), blogger.getUserName()));
		try {
			subject.login(token);
			return "redirect:/admin/main.jsp";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("blogger", blogger);
			request.setAttribute("errorInfo", "用户名或者密码错误");
			return "login";
		}
	}
	
	@RequestMapping("/aboutMe")
	public ModelAndView aboutMe()throws Exception{
		ModelAndView modelAndView=new ModelAndView();
		
		List<BlogType> blogTypeCountList=blogTypeService.countList();
		List<Link> linkList=linkService.list(null);
		List<Blog> blogCountList=blogService.countList(); 
		
		modelAndView.addObject("blogTypeCountList", blogTypeCountList);
		modelAndView.addObject("linkList", linkList);
		modelAndView.addObject("blogCountList", blogCountList);
		
		modelAndView.addObject("mainPage", "foreground/blogger/info.jsp");
		modelAndView.setViewName("blog/maintemp");
		return modelAndView;
	}
	
	@RequestMapping("/version")
	public ModelAndView version()throws Exception{
		ModelAndView modelAndView=new ModelAndView();
		
		List<BlogType> blogTypeCountList=blogTypeService.countList();
		List<Link> linkList=linkService.list(null);
		List<Blog> blogCountList=blogService.countList(); 
		
		modelAndView.addObject("blogTypeCountList", blogTypeCountList);
		modelAndView.addObject("linkList", linkList);
		modelAndView.addObject("blogCountList", blogCountList);
		
		modelAndView.addObject("mainPage", "foreground/blogger/version.jsp");
		modelAndView.setViewName("blog/maintemp");
		return modelAndView;
	}
}
