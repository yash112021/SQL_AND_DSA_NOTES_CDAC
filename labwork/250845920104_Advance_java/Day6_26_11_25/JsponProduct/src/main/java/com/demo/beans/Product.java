package com.demo.beans;

public class Product {
	private int pid;
	private String desc;
	private int price;
	

	private int qty;
	private float payamount;
	
	// defalut constructor
	public Product() {
		super();
	}  
	
	
	// parameterized constuctor
	
	public Product(int productId, String desc, int price, int qty, float payamount) {
		super();
		this.pid = productId;
		this.desc = desc;
		this.price = price;
		this.qty = qty;
		this.payamount = payamount;
	}


	public int getProductId() {
		return pid;
	}


	public void setProductId(int productId) {
		this.pid = productId;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public float getPayamount() {
		return payamount;
	}


	public void setPayamount(float payamount) {
		this.payamount = payamount;
	}


	@Override
	public String toString() {
		return "Product [productId=" + pid + ", desc=" + desc + ", price=" + price + ", qty=" + qty
				+ ", payamount=" + payamount + "]";
	}
	
	
}
