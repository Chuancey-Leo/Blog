package com.leo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.leo.entity.Blog;
import com.leo.entity.Comment;
import com.leo.service.BlogService;
import com.leo.service.CommentService;
import com.leo.util.ResponseUtil;
import com.sun.org.apache.bcel.internal.generic.NEW;

import net.sf.json.JSONObject;

@Controller
//表单提交时的action映射
@RequestMapping("/comment")
public class CommentController {
	
	@Resource
	private CommentService commentService;
	@Resource
	private BlogService blogService;
	
	@RequestMapping("/save")
	public String save(Comment comment,@RequestParam("imageCode") String imageCode,
			HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception{
		String sRand=(String)session.getAttribute("sRand");
		int resultTotal=0;
		JSONObject jsonObject=new JSONObject();
		if(!imageCode.equals(sRand)){
			jsonObject.put("success", false);
			jsonObject.put("errorInfo", "验证码填写错误");
		}else{
			String ip=request.getRemoteAddr();//获取ip
			comment.setIp(ip);
			if(comment.getId()==null){
				resultTotal=commentService.add(comment);
				Blog blog=blogService.findById(comment.getBlog().getId());
				blog.setReplyHit(blog.getReplyHit()+1);
				blogService.update(blog);
			}else{
				
			}
		}
		if(resultTotal>0){
			jsonObject.put("success", true);
		}else{
			jsonObject.put("success", false);
		}
		ResponseUtil.write(response, jsonObject); 
		return null;
	}
}
