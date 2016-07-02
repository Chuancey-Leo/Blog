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
import com.leo.entity.BlogType;
import com.leo.entity.PageBean;
import com.leo.service.BlogTypeService;
import com.leo.util.ResponseUtil;
import com.leo.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

@Controller
@RequestMapping("/admin/blogType")
public class BlogTypeAdminController {

	@Resource
	private BlogTypeService blogTypeService;
	
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page
			,@RequestParam(value="rows",required=false)String rows,HttpServletResponse response)throws Exception{
		PageBean pageBean=new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		Map<String, Object> map=new HashMap<String, Object>();

		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		
		List<BlogType> list=blogTypeService.list(map);
		long total=blogTypeService.getTotal(map);
		
		JSONObject result=new JSONObject();
		
		
		JSONArray jsonArray=JSONArray.fromObject(list);
		
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		
		return null;
		
	}
	
	@RequestMapping("/save")
	public String save(BlogType blogtype,HttpServletResponse response)throws Exception{
		
		int resultTotal=0;
		
		if(blogtype.getId()==null){
			blogTypeService.add(blogtype);
			resultTotal=1;
		}else{
			blogTypeService.update(blogtype);
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
	
	
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="ids",required=false)String ids,HttpServletResponse response)throws Exception
	{
		String[] idsStr=ids.split(",");
		for(int i=0; i<idsStr.length;i++){
			blogTypeService.delete(Integer.parseInt(idsStr[i]));
		}
		
		JSONObject result1=new JSONObject();
		result1.put("success", true);
		ResponseUtil.write(response, result1);
		return null;
		
	}
}
