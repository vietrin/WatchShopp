package com.watchshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.watchshop.model.ShoppingCart;
import com.watchshop.service.ShoppingCartService;

@Controller
public class ShoppingCartController {

	@Autowired
	private ShoppingCartService shoppingCartService;

	@RequestMapping(value = "addCart/{id}", method = RequestMethod.GET)
	public String addCart(@PathVariable int id, Model model ) {
		System.out.println("Da vao gio hang tam" + id );
		ShoppingCart shoppingCart= new ShoppingCart(id, 1, 1);
		shoppingCartService.check(shoppingCart);
		return "redirect:/trang-chu";
	}
}
