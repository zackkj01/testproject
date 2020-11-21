package com.leminhduc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.leminhduc.model.Product;



@Repository
public class ProductDAOImpl implements ProductDAO {

	private static final Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}


	     @Transactional
		@SuppressWarnings("unchecked")
		public List<Product> getProductnew_shoes() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productsList = session.createQuery("FROM Product  WHERE cover=false and hot_new=true  ").list();
		for (Product c : productsList) {
			logger.info("Product List::" + c);
		}
		return productsList;
	}
	     @Transactional
			@SuppressWarnings("deprecation")
			public Product getProductById(int id) {
			Session session = this.sessionFactory.getCurrentSession();
			Product p =(Product) session.load( Product.class,new Integer(id));
				logger.info("Product loaded successfully,Product detail="+ p);
			return p;
		}

	     @Transactional
	     @SuppressWarnings("unchecked")
		public List<Product> getProductRelative(int id) {
	 		Session session = this.sessionFactory.getCurrentSession();	 
	 		List <Product> productsList= session.createQuery("FROM Product p where id in (from p.relative where id_product=" + id + ")").list();
	 		for (Product p : productsList) {
	 			logger.info("Product List::" + p);} 
	         return productsList;
		}
}

