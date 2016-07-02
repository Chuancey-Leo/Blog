package com.leo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.leo.entity.Blog;
import com.leo.entity.BlogType;
import com.leo.entity.Link;
import com.leo.entity.PageBean;
import com.leo.service.BlogService;
import com.leo.service.BlogTypeService;
import com.leo.service.LinkService;
import com.leo.util.PageUtil;
import com.leo.util.StringUtil;


/**
 * Ö÷Ò³controller
 * @author liao
 *
 */

@Controller
@RequestMapping("/")
public class IndexController {

	@Resource
	private BlogService blogService;
	@Resource
	private BlogTypeService blogTypeService;
	@Resource
	private LinkService linkService;
	/**
	 * ÇëÇóÖ÷Ò³
	 * @return
	 */
	@RequestMapping("/blogIndex")
	public ModelAndView index(@RequestParam(value="page",required=false)String page,@RequestParam(value="typeId",required=false)String typeId,@RequestParam(value="releaseDateStr",required=false)String releaseDateStr,HttpServletRequest request)throws Exception{
		ModelAndView modelAndView=new ModelAndView();
		if(StringUtil.isEmpty(page)){
			page="1";
		}
		
		PageBean pageBean=new PageBean(Integer.parseInt(page), 5);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		map.put("typeId", typeId);
		map.put("releaseDateStr", releaseDateStr);
		List<Blog> blogList=blogService.list(map);
		List<BlogType> blogTypeCountList=blogTypeService.countList();
		List<Link> linkList=linkService.list(null);
		List<Blog> blogCountList=blogService.countList(); 
		
		for (Blog blog : blogList) {
			List<String> imageList=blog.getImageList();
			String blogInfo=blog.getContent();
			Document document=Jsoup.parse(blogInfo);
			Elements elements=document.select("img[src$=.jpg]");
			for(int i=0;i<elements.size();i++){
				Element element=elements.get(i);
				System.out.println(element.toString());
				imageList.add(element.toString());
				if(i==2){
					break;
				}
			}
		}
		
		modelAndView.addObject("blogList", blogList);
		modelAndView.addObject("blogTypeCountList", blogTypeCountList);
		modelAndView.addObject("linkList", linkList);
		modelAndView.addObject("blogCountList", blogCountList);
		
		
		StringBuffer stringBuffer=new StringBuffer();
		if(StringUtil.isNotEmpty(typeId)){
			stringBuffer.append("typeId="+typeId+"&");
		}
		
		if(StringUtil.isNotEmpty(releaseDateStr)){
			stringBuffer.append("releaseDateStr="+releaseDateStr+"&");
		}
		String pageCode=PageUtil.genPagination(request.getContextPath()+"/blogIndex.html", blogService.getTotal(map), Integer.parseInt(page), 5, stringBuffer.toString());
		modelAndView.addObject("pageCode", pageCode);
		modelAndView.addObject("mainPage", "foreground/blog/list.jsp");
		modelAndView.setViewName("blog/maintemp");
		//modelAndView.setViewName("admin/writeBlog");

		return modelAndView;
	}
	
	@RequestMapping("/admin/write")
	public ModelAndView index(HttpServletRequest request)throws Exception{
		ModelAndView modelAndView=new ModelAndView();
	//	releaseDateStr=java.net.URLEncoder.encode(releaseDateStr,"gbk");

		

		List<BlogType> blogTypeCountList=blogTypeService.countList();

		List<Blog> blogCountList=blogService.countList(); 

		modelAndView.addObject("blogTypeCountList", blogTypeCountList);

		modelAndView.addObject("blogCountList", blogCountList);
		

		modelAndView.setViewName("admin/writeBlog");

		return modelAndView;
	}
}
