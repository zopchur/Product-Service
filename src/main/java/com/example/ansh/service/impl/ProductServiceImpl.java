package com.example.ansh.service.impl;

import org.springframework.stereotype.Service;

import com.example.ansh.beans.Product;
import com.example.ansh.service.ProductService;
import com.example.ansh.util.ProductConstant;

@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public Product getProductDetail(String productId) {
		Product product = ProductConstant.productMap.get(productId);
		/*
		 * try { Thread.sleep(1000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		System.out.println("Product Detail : "+product);
		return product;
	}

}
