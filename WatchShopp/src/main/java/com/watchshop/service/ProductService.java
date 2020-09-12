package com.watchshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watchshop.dao.ProductDao;
import com.watchshop.model.Product;
import com.watchshop.service.imp.IProductService;

@Service
public class ProductService implements IProductService {

	@Autowired
	private ProductDao productDao; 
	
	@Override
	public List<Product> findAll() {
		
		return productDao.findAll();
	}

	@Override
	public int create(Product product) {
		
		return productDao.create(product);
	}

	@Override
	public int update(Product product) {
		
		return productDao.update(product);
	}

	@Override
	public int delete(int id) {
		
		return productDao.delete(id);
	}

	@Override
	public Product findById(String key) {
		
		return productDao.findById(key);
	}

	@Override
	public List<Product> findByName(String key) {
		
		return productDao.findByName(key);
	}

	@Override
	public List<Product> sortDesc() {
		
		return productDao.sortDesc();
	}

	@Override
	public List<Product> sortASC() {
		
		return productDao.sortASC();
	}

}
