
package com.watchshop.dao.imp;

import com.watchshop.model.ShoppingCart;

public interface IShoppingCartDao {
	public int addCart(ShoppingCart shoppingCart);
	public int updateCart(int id);
	public int deleteCart(int id);
	public int checkCount(int id);
	public ShoppingCart findById(ShoppingCart shoppingCart);
	public int deleteDatabase(int id);
}
