package com.watchshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watchshop.dao.ShoppingCartDao;
import com.watchshop.model.ShoppingCart;
import com.watchshop.service.imp.IShoppingCartService;

@Service
public class ShoppingCartService implements IShoppingCartService {
	@Autowired
	private ShoppingCartDao shoppingCartDao;

	@Override
	public int addCart(ShoppingCart shoppingCart) {
		return shoppingCartDao.addCart(shoppingCart);
	}

	@Override
	public int updateCart(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCart(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int checkCount(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int check(ShoppingCart shoppingCart) {
		// TODO Auto-generated method stub
		if (shoppingCartDao.findById(shoppingCart) == null) {
			return shoppingCartDao.addCart(shoppingCart);
		} else
			return shoppingCartDao.updateCart(shoppingCart.getIdProduct());
	}

}
