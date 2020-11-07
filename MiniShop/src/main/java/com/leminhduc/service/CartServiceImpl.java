package com.leminhduc.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leminhduc.dao.CartDAO;
import com.leminhduc.model.Cart;

@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private CartDAO cartDAO;

	public void setCartDAO(CartDAO cartDAO) {
		this.cartDAO = cartDAO;
	}

	@Transactional
	public HashMap<Integer, Cart> AddCart(int id, HashMap<Integer, Cart> cart) {
		// TODO Auto-generated method stub
		return cartDAO.AddCart(id, cart);
	}

	@Transactional
	public HashMap<Integer, Cart> EditCart(int id, int quanty, HashMap<Integer, Cart> cart) {
		return cartDAO.EditCart(id, quanty, cart);
	}

	@Transactional
	public HashMap<Integer, Cart> DeleteCart(int id, HashMap<Integer, Cart> cart) {
		return cartDAO.DeleteCart(id, cart);
	}

	@Transactional
	public int TotalQuanty(HashMap<Integer, Cart> cart) {
		return cartDAO.TotalQuanty(cart);
	}

	@Transactional
	public double TotalPrice(HashMap<Integer, Cart> cart) {
		return cartDAO.TotalPrice(cart);
	}
	@Transactional
	public HashMap<Integer, Cart> AddCartMul(int id,int quanty, HashMap<Integer, Cart> cart){
		return cartDAO.AddCartMul(id, quanty, cart);
	}

}
