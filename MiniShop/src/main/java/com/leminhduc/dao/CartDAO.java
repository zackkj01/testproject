package com.leminhduc.dao;

import java.util.HashMap;

import com.leminhduc.model.Cart;

public interface CartDAO {
	public HashMap<Integer, Cart> AddCart(int id, HashMap<Integer, Cart> cart);

	public HashMap<Integer, Cart> EditCart(int id, int quanty, HashMap<Integer, Cart> cart);

	public HashMap<Integer, Cart> DeleteCart(int id, HashMap<Integer, Cart> cart);

	public int TotalQuanty(HashMap<Integer, Cart> cart);

	public double TotalPrice(HashMap<Integer, Cart> cart);
	
	public HashMap<Integer, Cart> AddCartMul(int id,int quanty, HashMap<Integer, Cart> cart);

}