package com.watchshop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.watchshop.dao.imp.IProductDao;
import com.watchshop.model.Product;

@Repository
@Transactional
public class ProductDao implements IProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Product> findAll() {
		String sql = "select * from product"; 
		return jdbcTemplate.query(sql, new RowMapper<Product>(){
			public Product mapRow(ResultSet resultSet , int row) throws SQLException {
				Product product= new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getLong(3), resultSet.getLong(4),resultSet.getString(5),resultSet.getString(6),resultSet.getInt(7),resultSet.getString(8));
				return product;
			}
		});
	}

	@Override
	public int create(Product product) {
		String sql = "insert into product (name, price, discount,image,company,id_category,url_link) values (?,?,?,?,?,?,?) "; 
		return jdbcTemplate.update(sql,product.getName(),product.getPrice(),product.getDiscount(),product.getImage(),product.getCompany(),product.getIdCategory(),product.getKey());
	}

	@Override
	public int update(Product product) {
		String sql = "insert into product (name, price, discount,image,company,id_category,url_link) values (?,?,?,?,?,?,?) "; 
		return jdbcTemplate.update(sql,product.getName(),product.getPrice(),product.getDiscount(),product.getImage(),product.getCompany(),product.getIdCategory(),product.getKey());
	}

	@Override
	public int delete(int id) {
		String sql = "delete from product where id = ? "; 
		return jdbcTemplate.update(sql,id);
	}

	@Override
	public Product findById(String key) {
		String sql = "select * from product where url_link = ?"; 
		return jdbcTemplate.queryForObject(sql,new Object[] { key }, new RowMapper<Product>(){
			public Product mapRow(ResultSet resultSet , int row) throws SQLException {
				Product product= new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getLong(3), resultSet.getLong(4),resultSet.getString(5),resultSet.getString(6),resultSet.getInt(7),resultSet.getString(8));
				return product;
			}
		});
	}

	@Override
	public List<Product> findByName(String key) {
		String sql = "select * from product where name like ? or company  like   ?"; 
		return jdbcTemplate.query(sql,new Object[] { key }, new RowMapper<Product>(){
			public Product mapRow(ResultSet resultSet , int row) throws SQLException {
				Product product= new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getLong(3), resultSet.getLong(4),resultSet.getString(5),resultSet.getString(6),resultSet.getInt(7),resultSet.getString(8));
				return product;
			}
		});
	}

	@Override
	public List<Product> sortDesc() {
		String Desc = "select * from product order by price desc"; 
		return jdbcTemplate.query(Desc, new RowMapper<Product>(){
			public Product mapRow(ResultSet resultSet , int row) throws SQLException {
				Product product= new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getLong(3), resultSet.getLong(4),resultSet.getString(5),resultSet.getString(6),resultSet.getInt(7),resultSet.getString(8));
				return product;
			}
		});
	}
	
	@Override
	public List<Product> sortASC() {
		String ASC = "select * from product order by price asc"; 
		return jdbcTemplate.query(ASC, new RowMapper<Product>(){
			public Product mapRow(ResultSet resultSet , int row) throws SQLException {
				Product product= new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getLong(3), resultSet.getLong(4),resultSet.getString(5),resultSet.getString(6),resultSet.getInt(7),resultSet.getString(8));
				return product;
			}
		});
	}

}
