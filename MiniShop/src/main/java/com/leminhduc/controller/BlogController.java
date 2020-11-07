package com.leminhduc.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;



@Controller
public class BlogController {
	@RequestMapping(value = "/blog")
	public ModelAndView mainPage() {
		return new ModelAndView("/blog/blog");

	}
	
}