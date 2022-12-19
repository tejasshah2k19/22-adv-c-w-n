package com.bean;

public class ProductBean {

	int productId;
	String name;
	int qty;
	float price;
	static int count = 0;
	String imgUrl;

	public ProductBean(String name, int qty, float price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
		this.productId = ++count;
		this.qty = qty;
		this.imgUrl = "images/" + count + ".jpg";
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		ProductBean.count = count;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

}
