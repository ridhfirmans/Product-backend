package com.aplikasi.product.productbackend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.aplikasi.product.productbackend.model.Product;
import com.aplikasi.product.productbackend.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductApiController {
	
	@Autowired
	ProductService prodService;
	
	@GetMapping("/product")
	@ResponseBody
	public List<Product> getAllProducts(){
		return prodService.getAllProducts();
	}

	@PostMapping("/product")
	@ResponseStatus(HttpStatus.CREATED)
	public void simpan(@RequestBody @Valid Product prod){
		prodService.save(prod);
	}
	//another mapping
}
