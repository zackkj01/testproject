package com.leminhduc.service;

import java.util.List;

import com.leminhduc.model.Product;


public interface ProductService {


	public List<Product> getProductnew_shoes();
	public Product getProductById(int id);
	public Product findById(long productId);



}
