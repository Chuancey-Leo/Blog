package com.leo.controller.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.leo.entity.Blog;
import com.leo.entity.PageBean;
import com.leo.service.BlogService;
import com.leo.util.ResponseUtil;
import com.leo.util.StringUtil;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.bcel.internal.generic.RETURN;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * 博客管理
 * @author liao
 *
 */
@Controller
@RequestMapping("/admin/blog")
public class BlogAdminController {
	
	@Resource
	private BlogService blogService;
	
	@RequestMapping("/save")
	public String save(Blog blog,HttpServletResponse response)throws Exception{
		
		int resultTotal=0;
		
		if(blog.getId()==null){
			blogService.add(blog);
			resultTotal=1;
		}else{
			blogService.update(blog);
			resultTotal=1;
		}
		JSONObject jsonObject=new JSONObject();
		if(resultTotal>0){
			jsonObject.put("success", true);
		}else{
			jsonObject.put("success", false);
		}
		
		ResponseUtil.write(response, jsonObject);//给出页面相应
		return null;
	}
	
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page
			,@RequestParam(value="rows",required=false)String rows
			,Blog s_blog,HttpServletResponse response)throws Exception{
		PageBean pageBean=new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("title", StringUtil.formatLike(s_blog.getTitle()));
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		
		List<Blog> list=blogService.list(map);
		long total=blogService.getTotal(map);
		
		JSONObject result=new JSONObject();
		
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
		
		JSONArray jsonArray=JSONArray.fromObject(list, jsonConfig);
		
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		
		return null;
		
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="ids",required=false)String ids,HttpServletResponse response)throws Exception
	{
		String[] idsStr=ids.split(",");
		for(int i=0; i<idsStr.length;i++){
			blogService.delete(Integer.parseInt(idsStr[i]));
		}
		
		JSONObject result1=new JSONObject();
		result1.put("success", true);
		ResponseUtil.write(response, result1);
		return null;
		
	}
	
	@RequestMapping("/findById")
	public String findById(@RequestParam(value="id",required=true)String id,HttpServletResponse response)throws Exception{
		
		Blog blog=blogService.findById(Integer.parseInt(id));
		JSONObject result=JSONObject.fromObject(blog);
		
		ResponseUtil.write(response, result);
		return null;
	}
}
