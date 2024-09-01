package com.product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.product.Entity.Product;
import com.product.Service.Impl_ProductService;

import lombok.extern.log4j.Log4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin
@RestController
@RequestMapping("/v1")
public class ProductController {

	@Autowired
	Impl_ProductService ps;
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable Long id){
		Product p = ps.getProduct(id);
		return new ResponseEntity<Product>(p,HttpStatus.OK);
		
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product> >getAllProduct(){
		List<Product> pl = ps.getAllProducts();
		return new ResponseEntity<List<Product>>(pl,HttpStatus.OK);
		
	}
	
	@PostMapping("/product")
	public ResponseEntity createProduct (@RequestBody Product P) {
		//TODO: process POST request
		ps.createProduct(P);
		return new ResponseEntity<>("Product Inserted Successfully",HttpStatus.OK);
	}
	
	@PutMapping("/product")
	public ResponseEntity updateProduct (@RequestBody Product P) {
		//TODO: process POST request
		ps.updateProduct(P);
		return new ResponseEntity<>("Update Inserted Successfully",HttpStatus.OK);
	}
	
	@DeleteMapping("/product/{id}")
	public ResponseEntity deleteProduct(@PathVariable Long id) {
		ps.deleteProduct(id);
		return new ResponseEntity<>("Product Deleted Successfully",HttpStatus.OK);
	}
}
