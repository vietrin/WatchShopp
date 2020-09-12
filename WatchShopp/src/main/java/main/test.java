package main;

import com.watchshop.dao.ShoppingCartDao;
import com.watchshop.model.ShoppingCart;

public class test {
	public static void main(String[] args) {
		ShoppingCart shoppingCart= new ShoppingCart(1, 1, 1);
		ShoppingCartDao shoppingCartDao = new ShoppingCartDao() ;
		System.out.println("Da vao gio hang tam"+ shoppingCartDao.findById(shoppingCart)  );
		
		
	}
	
}
