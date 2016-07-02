package com.leo.controller.admin;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leo.entity.Blogger;
import com.leo.service.BloggerService;
import com.leo.util.CryptographyUtil;
import com.leo.util.ResponseUtil;

import net.sf.json.JSONObject;

/**
 * 管理员博主Controller层
 * @author liao
 *
 */

@Controller
@RequestMapping("/admin/blogger")
public class BloggerAdminController {
	@Resource
	private BloggerService bloggerService;
	
	@RequestMapping("/logout")
	public String  logout()throws Exception{
		SecurityUtils.getSubject().logout();
		return "redirect:/login.jsp";
	}
	
	@RequestMapping("/modifyPassword")
	public String modifyPassword(String newPassword,HttpServletResponse response)throws Exception{
		Blogger blogger=new Blogger();
		blogger.setPassword(CryptographyUtil.md5(newPassword, "leo"));
		int resultTotal=bloggerService.update(blogger);
		JSONObject result=new JSONObject();

		if(resultTotal>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}
}
