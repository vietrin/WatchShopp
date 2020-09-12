package com.watchshop.model;

public class OrderDetail {
	private int id ;
	private int idOrder;
	private int idProduct;
	private long count;
	private long price;
	private long total;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public OrderDetail(int id, int idOrder, int idProduct, long count, long price, long total) {
		super();
		this.id = id;
		this.idOrder = idOrder;
		this.idProduct = idProduct;
		this.count = count;
		this.price = price;
		this.total = total;
	}
 
	
}
