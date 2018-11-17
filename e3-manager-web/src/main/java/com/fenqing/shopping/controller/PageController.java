package com.fenqing.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这是用来不能直接访问的页面转发处理的
 * @author yikai
 *
 */
@Controller
public class PageController {
	
	/**
	 * 首页访问
	 * @return
	 */
	@RequestMapping("/")
	public String showIndex() {
		return "index";
		
	}
	
	/**
	 * 其他页面访问
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable("page")String page) {
		return page;
	}
	
}
