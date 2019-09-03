package com.aplikasi.product.productbackend.service;

import java.util.List;

import com.aplikasi.product.productbackend.model.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	public void save(Product prod);
}
