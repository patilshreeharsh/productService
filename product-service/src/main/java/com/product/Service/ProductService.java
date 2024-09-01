package com.product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.product.Entity.Product;
import com.product.Reposetry.ProductReposetry;

@Component
public class ProductService implements Impl_ProductService{

@Autowired
ProductReposetry pr;
	
	@Override
	public void createProduct(Product product) {
		// TODO Auto-generated method stub
		pr.save(product);
		
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		pr.save(product);
	}

	@Override
	public Product getProduct(Long id) {
		// TODO Auto-generated method stub
		
		return pr.findById(id).get();
	}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List <Product> pl = pr.findAll();
		return pl;
	}

}
