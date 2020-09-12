package com.watchshop.model;

public class Order {
	private int id ;
	private int idCustomer;
	private long total;
	private String dateCreate;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public String getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(String dateCreate) {
		this.dateCreate = dateCreate;
	}
	public Order (int id, int idCustomer, long total, String dateCreate) {
		super();
		this.id = id;
		this.idCustomer = idCustomer;
		this.total = total;
		this.dateCreate = dateCreate;
	}
	
}
