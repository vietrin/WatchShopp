package com.watchshop.service.imp;

import com.watchshop.model.ShoppingCart;

public interface IShoppingCartService {
	public int addCart(ShoppingCart shoppingCart);
	public int updateCart(int id);
	public int deleteCart(int id);
	public int checkCount(int id);
	public int check(ShoppingCart shoppingCart);
}
