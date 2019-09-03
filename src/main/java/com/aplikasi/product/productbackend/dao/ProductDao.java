package com.aplikasi.product.productbackend.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aplikasi.product.productbackend.model.Product;

@Mapper
public interface ProductDao {
	public List<Product> getAllProducts();
	public void save(Product prod);
}
