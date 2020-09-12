package com.watchshop.model;

public class ShoppingCart {
	private int id ;
	private int idProduct;
	private int idCustomer;
	private int count;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public long getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public ShoppingCart(int id, int idProduct, int idCustomer, int count) {
		super();
		this.id = id;
		this.idProduct = idProduct;
		this.idCustomer = idCustomer;
		this.count = count;
	}
	public ShoppingCart( int idProduct, int idCustomer, int count) {
		super();
		this.idProduct = idProduct;
		this.idCustomer = idCustomer;
		this.count = count;
	}

	
	
}
