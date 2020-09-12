package com.watchshop.model;

public class Product {

	private int id;
	private int idCategory;
	private String name;
	private long price;
	private long discount;
	private String image;
	private String company;
	private String key;

	public Product(int id, String name, long price, long discount,String image, String company, int idCategory,String key) {
		super();
		this.id = id;
		this.key=key;
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.image=image;
		this.company = company;
		this.idCategory=idCategory;
	}

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getDiscount() {
		return discount;
	}

	public void setDiscount(long discount) {
		this.discount = discount;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}


	
	
}
