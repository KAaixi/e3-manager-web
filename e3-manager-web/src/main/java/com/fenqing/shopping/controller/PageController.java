package com.fenqing.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ������������ֱ�ӷ��ʵ�ҳ��ת�������
 * @author yikai
 *
 */
@Controller
public class PageController {
	
	/**
	 * ��ҳ����
	 * @return
	 */
	@RequestMapping("/")
	public String showIndex() {
		return "index";
		
	}
	
	/**
	 * ����ҳ�����
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable("page")String page) {
		return page;
	}
	
}
