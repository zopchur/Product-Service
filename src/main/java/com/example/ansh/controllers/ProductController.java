package com.example.ansh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ansh.beans.Product;
import com.example.ansh.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "/{productId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Product getProductDetail(@PathVariable String productId) {
		
		Product product = productService.getProductDetail(productId);
		
		return product;
	}
	
}
