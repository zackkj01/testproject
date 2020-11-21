package com.leminhduc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.leminhduc.model.Product;

import java.sql.Timestamp;
import java.util.List;

/**
 * Entity bean with JPA annotations Hibernate provides JPA implementation
 */
@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id")

	private List<Relatedproduct> relative;
	
	public List<Relatedproduct> getRelative() {
		return relative;
	}
	public void setRelative(List<Relatedproduct> relative) {
		this.relative = relative;
	}
	@Column(name = "title")
    protected String title;
    @Column(name = "description")
    protected String description;
    @Column(name = "price")
    protected double price;
    @Column(name = "price_net")
    protected double price_net; 
    @Column(name = "available")
    protected int available;
    @Column(name = "sold")
    protected int sold;
    @Column(name = "deal_timer")
    protected Timestamp deal_timer;
    @Column(name = "discount")
    protected int discount;
    @Column(name = "image")
    protected String image;
    @Column(name = "cover")
    protected boolean cover;
    @Column(name = "hot_deal")
    protected boolean hot_deal;
    @Column(name = "hot_new")
    protected boolean hot_new;
    @Column(name = "hot_best")
    protected boolean hot_best;
    @Column(name = "trend")
    protected boolean trend;
    @Column(name = "latest_review")
    protected boolean latest_review;
    @Column(name = "id_category")
    protected int id_category; 
    public Product() {  }
    public Product(int id, String title, String description, double price,int discount, String image, boolean hot_deal, boolean hot_new,boolean hot_best,boolean trend,boolean latest_review,int id_category) {
    this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.discount = discount;        
        this.image= image;
        this.id_category = id_category;
        this.hot_deal = hot_deal;
        this.hot_new = hot_new;
        this.hot_best = hot_best;
        this.trend =trend;
        this.latest_review = latest_review;        
    }
    public Product(int id, String title, String description, double price,double price_net, int available,int sold,Timestamp deal_timer,int discount , String image,int id_category) {
    this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.image= image;
        this.id_category = id_category;
        this.price_net = price_net;
        this.sold = sold;
        this.deal_timer = deal_timer;
        this.available = available;     
        this.discount = discount ;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice_net() {
		return price_net;
	}
	public void setPrice_net(double price_net) {
		this.price_net = price_net;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	public Timestamp getDeal_timer() {
		return deal_timer;
	}
	public void setDeal_timer(Timestamp deal_timer) {
		this.deal_timer = deal_timer;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public boolean isCover() {
		return cover;
	}
	public void setCover(boolean cover) {
		this.cover = cover;
	}
	public boolean isHot_deal() {
		return hot_deal;
	}
	public void setHot_deal(boolean hot_deal) {
		this.hot_deal = hot_deal;
	}
	public boolean isHot_new() {
		return hot_new;
	}
	public void setHot_new(boolean hot_new) {
		this.hot_new = hot_new;
	}
	public boolean isHot_best() {
		return hot_best;
	}
	public void setHot_best(boolean hot_best) {
		this.hot_best = hot_best;
	}
	public boolean isTrend() {
		return trend;
	}
	public void setTrend(boolean trend) {
		this.trend = trend;
	}
	public boolean isLatest_review() {
		return latest_review;
	}
	public void setLatest_review(boolean latest_review) {
		this.latest_review = latest_review;
	}
	public int getId_category() {
		return id_category;
	}
	public void setId_category(int id_category) {
		this.id_category = id_category;
	}
	
	@Override
	public String toString() {
		return "Products [id=" + id + ", title=" + title + ", description=" + description +",price=" 
	+ price + "price_net=" + price_net + ",available=" + available + ",sold=" + sold + ",deal_timer=" 
				+ deal_timer + ",discount=" + discount + ",image=" + image + ",cover=" + cover + ",hot_deal=" 
	+ hot_deal + ",hot_new=" + hot_new + ",hot_best=" + hot_best + ",trend="+ trend + ",latest_review="
				+ latest_review + ",id_category=" + id_category + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public int getProductPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}