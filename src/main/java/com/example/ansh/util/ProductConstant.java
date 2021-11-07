package com.example.ansh.util;

import java.util.HashMap;
import java.util.Map;

import com.example.ansh.beans.Product;

public class ProductConstant {

	public static Map<String, Product> productMap = new HashMap<>();
	
	static {
		productMap.put("P1001", new Product("P1001", "Mobile","12333"));
		productMap.put("P1002", new Product("P1002", "Watch","45633"));
		productMap.put("P1003", new Product("P1003", "Laptop","1933"));
		productMap.put("P1004", new Product("P1004", "Charger","33"));
	}
}
