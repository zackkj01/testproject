package com.leminhduc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leminhduc.dao.ProductDAO;
import com.leminhduc.model.Product;

@Service

public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productDAO;

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	@Transactional
	public List<Product> getProductnew_shoes() {
		return this.productDAO.getProductnew_shoes();
	}
	@Transactional
	public Product getProductById(int id) {
		return this.productDAO.getProductById(id);
	}
	@Override
	public Product findById(long productId) {
		// TODO Auto-generated method stub
		return null;
	}
}
