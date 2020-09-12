package com.watchshop.dao.imp;

import java.util.List;

import com.watchshop.model.Product;

public interface IProductDao {
	public List<Product> findAll();
	public int create(Product product);
	public int update(Product product);
	public int delete(int id);
	public Product findById(String  key);
	public List<Product> findByName(String key);
	public List<Product> sortDesc();
	public List<Product> sortASC();
}
