package com.watchshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.watchshop.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = { "/", "trang-chu" }, method = RequestMethod.GET)
	public String view(Model model) {
		model.addAttribute("listProduct", productService.findAll());
		return "user/Home";
	}
	@RequestMapping(value = "san-pham/{key}", method = RequestMethod.GET)
	public String detail(@PathVariable String key , Model model) {
		model.addAttribute("product", productService.findById(key));
		return "user/Detail";
	}
}
