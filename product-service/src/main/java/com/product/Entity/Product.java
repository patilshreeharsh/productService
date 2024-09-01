package com.product.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data   
@Table(name="product")
public class Product {

	@Id
	private Long id;
	
	@Column(name="product_code")
	private String productCode;
	
	@Column(name="name")
	private String name;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="price")
	private float price;
	
	@Column(name="description")
	private String description;
	
}
