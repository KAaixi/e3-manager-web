package com.fenqing.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemContiller {
	
	
	
	@RequestMapping("/item/list")
	public String itemList(int page, int rows) {
		
		return null;
	}
	
}
