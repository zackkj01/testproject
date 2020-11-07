package com.leminhduc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.leminhduc.model.Product;
import com.leminhduc.service.ProductService;


@Controller
@RequestMapping(value = "/")
public class HomeController {

	private ProductService productService;




	@Autowired(required = true)
	@Qualifier(value = "productService")
	public void setProductService(ProductService ps) {
		this.productService = ps;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listProducts(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("getProductnew_shoes", this.productService.getProductnew_shoes());
	
		return "/home/home";
	}
	@RequestMapping(value = "/cart")
	public ModelAndView indexPage() {
		return new ModelAndView("cart/cart");
	}
}

