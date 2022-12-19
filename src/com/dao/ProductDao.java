package com.dao;

import java.util.ArrayList;

import com.bean.ProductBean;

public class ProductDao {

	public static ArrayList<ProductBean> products = new ArrayList<ProductBean>();

	static {

		ProductBean p1 = new ProductBean("iphoneX", 5, 100000);
		ProductBean p2 = new ProductBean("iphone11", 5, 110000);
		ProductBean p3 = new ProductBean("iphone12", 5, 120000);
		ProductBean p4 = new ProductBean("iphone13", 5, 130000);
		ProductBean p5 = new ProductBean("iphone14", 5, 140000);
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);

	}
}
