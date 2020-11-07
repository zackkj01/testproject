package com.leminhduc.dao;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.leminhduc.model.Cart;
import com.leminhduc.model.Product;

@Repository
public class CartDAOImpl implements CartDAO {
	private static final Logger logger = LoggerFactory.getLogger(CartDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Autowired
	private ProductDAO productDAO;

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	public HashMap<Integer, Cart> AddCart(int id, HashMap<Integer, Cart> cart) {
		Cart itemCart = new Cart();
		Product product = productDAO.getProductById(id);
		if (product != null && cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(itemCart.getQuanty() + 1);
			itemCart.setTotal_price(itemCart.getQuanty() * itemCart.getProduct().getPrice());
		} else {
			itemCart.setProduct(product);
			itemCart.setQuanty(1);
			itemCart.setTotal_price(product.getPrice());
		}
		cart.put(id, itemCart);
		return cart;
	}

	public HashMap<Integer, Cart> EditCart(int id, int quanty, HashMap<Integer, Cart> cart) {
		if (cart == null) {
			return cart;
		}
		Cart itemCart = new Cart();
		if (cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(quanty);
			double Total_price = quanty * itemCart.getProduct().getPrice();
			itemCart.setTotal_price(Total_price);
		}
		cart.put((int) id, itemCart);
		return cart;
	}

	public HashMap<Integer,Cart> DeleteCart(int id,HashMap<Integer,Cart> cart) {
	  if(cart==null) 
	  { return cart; } 
	  if(cart.containsKey(id)) 
	  { cart.remove(id); }
	  
	  return cart; }

	public int TotalQuanty(HashMap<Integer, Cart> cart) {
		int totalQuanty = 0;
		for (Map.Entry<Integer, Cart> itemCart : cart.entrySet()) {
			totalQuanty += itemCart.getValue().getQuanty();
		}

		return totalQuanty;
	}

	public double TotalPrice(HashMap<Integer, Cart> cart) {
		double totalPrice = 0;
		for (Map.Entry<Integer, Cart> itemCart : cart.entrySet()) {
			totalPrice += itemCart.getValue().getTotal_price();
		}

		return totalPrice;
	}
	public HashMap<Integer, Cart> AddCartMul(int id,int quanty, HashMap<Integer, Cart> cart) {
		Cart itemCart = new Cart();
		Product product = productDAO.getProductById(id);
		if (product != null && cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(itemCart.getQuanty() + quanty);
			itemCart.setTotal_price(itemCart.getQuanty() * itemCart.getProduct().getPrice());
		} else {
			itemCart.setProduct(product);
			itemCart.setQuanty(quanty);
			itemCart.setTotal_price(product.getPrice());
		}
		cart.put(id, itemCart);
		return cart;
	}

}
