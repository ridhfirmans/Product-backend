package com.aplikasi.product.productbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer	 id;
	@NotNull @NotEmpty
	private String namaProduct;
	@NotNull
	private Integer harga;
	@NotNull
	private Integer stok;
	@NotNull
	private Integer minimumStok;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNamaProduct() {
		return namaProduct;
	}
	public void setNamaProduct(String namaProduct) {
		this.namaProduct = namaProduct;
	}
	public Integer getHarga() {
		return harga;
	}
	public void setHarga(Integer harga) {
		this.harga = harga;
	}
	public Integer getStok() {
		return stok;
	}
	public void setStok(Integer stok) {
		this.stok = stok;
	}
	public Integer getMinimumStok() {
		return minimumStok;
	}
	public void setMinimumStok(Integer minimumStok) {
		this.minimumStok = minimumStok;
	}
	
	
	
	

}
