package com.watchshop.model;

public class Category  {
	
	private int id;
	private String name;
	private Product product;

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
