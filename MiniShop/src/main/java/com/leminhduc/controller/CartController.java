package com.leminhduc.controller;


import java.util.Map.Entry;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.leminhduc.model.Cart;
import com.leminhduc.model.Product;
import com.leminhduc.service.ProductService;

@Controller
@RequestMapping(value = "/cart")
public class CartController {
	    @Autowired
	    private ProductService productService;

	    @SuppressWarnings("unchecked")
		@RequestMapping(value = "add/{id}", method = RequestMethod.GET)
	    public String viewAdd(ModelMap mm, HttpSession session, @PathVariable("id") long productId) {
	        HashMap<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCartItems");
	        if (cartItems == null) {
	            cartItems = new HashMap<>();
	        }
	        Product product = productService.findById(productId);
	        if (product != null) {
	            if (cartItems.containsKey(productId)) {
	                Cart item = cartItems.get(productId);
	                item.setProduct(product);
	                item.setQuantity(item.getQuantity() + 1);
	                cartItems.put(productId, item);
	            } else {
	                Cart item = new Cart();
	                item.setProduct(product);
	                item.setQuantity(1);
	                cartItems.put(productId, item);
	            }
	        }
	        session.setAttribute("myCartItems", cartItems);
	        session.setAttribute("myCartTotal", totalPrice(cartItems));
	        session.setAttribute("myCartNum", cartItems.size());
	        return "cart/cart";
	    }

	    @SuppressWarnings("unused")
		private void ById(long productId) {
			// TODO Auto-generated method stub
			
		}

		@SuppressWarnings("unchecked")
		@RequestMapping(value = "sub/{id}", method = RequestMethod.GET)
	    public String viewUpdate(ModelMap mm, HttpSession session, @PathVariable("id") long productId) {
	        HashMap<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCartItems");
	        if (cartItems == null) {
	            cartItems = new HashMap<>();
	        }
	        session.setAttribute("myCartItems", cartItems);
	        return "cart/cart";
	    }

	    @SuppressWarnings("unchecked")
		@RequestMapping(value = "remove/{id}", method = RequestMethod.GET)
	    public String viewRemove(ModelMap mm, HttpSession session, @PathVariable("id") long productId) {
	        HashMap<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCartItems");
	        if (cartItems == null) {
	            cartItems = new HashMap<>();
	        }
	        if (cartItems.containsKey(productId)) {
	            cartItems.remove(productId);
	        }
	        session.setAttribute("myCartItems", cartItems);
	        session.setAttribute("myCartTotal", totalPrice(cartItems));
	        session.setAttribute("myCartNum", cartItems.size());
	        return "cart/cart";
	    }

	    public double totalPrice(HashMap<Long, Cart> cartItems) {
	        int count = 0;
	        for (Entry<Long, Cart> list : cartItems.entrySet()) {
	            count += list.getValue().getProduct().getProductPrice() * list.getValue().getQuantity();
	        }
	        return count;
	    }

	}