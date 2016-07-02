package com.leo.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leo.entity.Blog;
import com.leo.entity.BlogType;
import com.leo.entity.Link;
import com.leo.service.BlogService;
import com.leo.service.BlogTypeService;
import com.leo.service.CommentService;
import com.leo.service.LinkService;
import com.leo.util.StringUtil;

@Controller
//表单提交时的action映射
@RequestMapping("/blog")
public class BlogController {
	
	@Resource
	private BlogService blogService;
	@Resource
	private BlogTypeService blogTypeService;
	@Resource
	private LinkService linkService;
	
	@Resource
	private CommentService commentService;
	
	@RequestMapping("/articles/{id}")
	public ModelAndView details(@PathVariable("id") Integer id,HttpServletRequest request)throws Exception{
		
		ModelAndView modelAndView=new ModelAndView();
		Blog blog=blogService.findById(id);
		String keyWords=blog.getKeyWord();
		if(StringUtil.isNotEmpty(keyWords)){
			String string[]=keyWords.split(" ");
			modelAndView.addObject("keyWords", StringUtil.filterWhite(Arrays.asList(string)));
		}else{
			modelAndView.addObject("keyWords",null);
		}
		modelAndView.addObject("blog", blog);
		blog.setClickHit(blog.getClickHit()+1);
		blogService.update(blog);
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("blogId", blog.getId());
		map.put("state", 1);
		List<BlogType> blogTypeCountList=blogTypeService.countList();
		List<Link> linkList=linkService.list(null);
		List<Blog> blogCountList=blogService.countList(); 
		
		modelAndView.addObject("blogTypeCountList", blogTypeCountList);
		modelAndView.addObject("linkList", linkList);
		modelAndView.addObject("blogCountList", blogCountList);
		modelAndView.addObject("commentList", commentService.list(map));
		modelAndView.addObject("lastnext", this.getUpAndDownPageCode(blogService.getLastBlog(id), blogService.getNextBlog(id), request.getServletContext().getContextPath()));
		modelAndView.addObject("mainPage", "foreground/blog/view.jsp");
		modelAndView.setViewName("blog/maintemp");
		return modelAndView;
	}
	
	private String getUpAndDownPageCode(Blog lastBlog,Blog nextBlog,String projectContext){
		StringBuffer stringBuffer=new StringBuffer();
		if(lastBlog==null||lastBlog.getId()==null){
			stringBuffer.append("<p>上一篇：没有了！</p>");
		}else{
			stringBuffer.append("<p>上一篇：<a href='"+projectContext+"/blog/articles/"+lastBlog.getId()+".html'>"+lastBlog.getTitle()+"</a></p>");
		}
		
		if(nextBlog==null||nextBlog.getId()==null){
			stringBuffer.append("<p>下一篇：没有了！</p>");
		}else{
			stringBuffer.append("<p>下一篇：<a href='"+projectContext+"/blog/articles/"+nextBlog.getId()+".html'>"+nextBlog.getTitle()+"</a></p>");

		}
		
		return stringBuffer.toString();
	}
}
