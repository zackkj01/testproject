package com.leminhduc.model;
public class Cart {

    private Product product;
    private double Total_price;
    private int quanty;

    public Cart() {
    }

	public Cart(Product product, double total_price, int quanty) {
		super();
		this.product = product;
		Total_price = total_price;
		this.quanty = quanty;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getTotal_price() {
		return Total_price;
	}

	public void setTotal_price(double total_price) {
		Total_price = total_price;
	}

	public int getQuanty() {
		return quanty;
	}

	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}

   
}
