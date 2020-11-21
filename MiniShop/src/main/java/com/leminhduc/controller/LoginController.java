package com.leminhduc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("dangnhap/")
public class LoginController {
	@GetMapping
	public String Default(){
		
		return "dangnhap";
	}
   
}
