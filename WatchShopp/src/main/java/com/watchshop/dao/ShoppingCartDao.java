package com.watchshop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.watchshop.dao.imp.IShoppingCartDao;
import com.watchshop.model.ShoppingCart;

@Repository
@Transactional
public class ShoppingCartDao implements IShoppingCartDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int addCart(ShoppingCart shoppingCart) {
	String sql = "insert into cart (id_product, id_customer, count) values (?,?,?)";
		return jdbcTemplate.update(sql, shoppingCart.getIdProduct(),shoppingCart.getIdCustomer(),shoppingCart.getCount());
	}

	@Override
	public int updateCart(int id) {
		String sql = "update cart set count = ( count + 1 ) where id_product = ? ";
		return jdbcTemplate.update(sql,id);
	}

	@Override
	public int deleteCart(int id) {
		String sql = "update cart set count = ( count - 1 ) where id_product = ? ";
		return jdbcTemplate.update(sql,id);
	}

	@Override
	public int checkCount(int id) {
		String sql = "select count from cart where id_product = ? ";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, Integer.class);
	}

	@Override
	public int deleteDatabase(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override	
	public ShoppingCart findById(ShoppingCart shoppingCart) {
		String sql = "select * from cart where id_product = ? ";
		System.out.println("ham" + shoppingCart.getIdProduct());
		return jdbcTemplate.queryForObject(sql, new Object[] {shoppingCart.getIdProduct()}, new RowMapper<ShoppingCart>(){
			public ShoppingCart mapRow(ResultSet resultSet, int row) throws SQLException {
				ShoppingCart shoppingCart = new ShoppingCart(resultSet.getInt(1),resultSet.getInt(2), resultSet.getInt(3));
				return shoppingCart;
			}
		});
	}

	public int check(int id) {
		String sql = "select count(*) from cart where id_product = ? ";
		System.out.println("ham" + id);
		
		Integer rs = jdbcTemplate.queryForObject(sql,Integer.class, id);
		System.out.println(rs);
		return rs;
		
	}
}
