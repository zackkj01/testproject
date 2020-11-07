package com.leminhduc.dao;

import java.util.List;

import com.leminhduc.model.Product;


public interface ProductDAO {
	
	
	public List<Product> getProductnew_shoes();
	public Product getProductById(int id);
	
}