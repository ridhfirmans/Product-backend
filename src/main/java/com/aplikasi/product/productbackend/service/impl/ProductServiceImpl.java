package com.aplikasi.product.productbackend.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aplikasi.product.productbackend.dao.ProductDao;
import com.aplikasi.product.productbackend.model.Product;
import com.aplikasi.product.productbackend.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService{

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Autowired
	ProductDao productDao;
	
	@Override
	public List<Product> getAllProducts(){
		List<Product> dataProducts = productDao.getAllProducts();
		return dataProducts;
	}
	
	@Override
	public void save(Product prod){
		LOGGER.info("test ini id nyaaaaaaaaaaaaaaaaaaaa: "+prod.getId());
		productDao.save(prod); 
	}
}
