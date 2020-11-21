package com.leminhduc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Relatedproducts")
public class Relatedproduct {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "id_product")
	private int id_product;
	@ManyToOne
	@JoinColumn(name = "id_product", nullable = false, insertable = false, updatable = false)
	private Product product;

	public Relatedproduct() {
	}

	public Relatedproduct(int id, int id_product) {
		this.id = id;
		this.id_product = id_product;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdProduct() {
		return id_product;
	}

	public void setIdProduct(int id_product) {
		this.id_product = id_product;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "ProductRelative [id=" + id + ", id_product=" + id_product + "]";
	}



}
