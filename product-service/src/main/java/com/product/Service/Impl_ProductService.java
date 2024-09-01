package com.product.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.Entity.Product;

@Service
public interface Impl_ProductService {
void createProduct(Product product);
void updateProduct(Product product);
Product getProduct(Long id);
void deleteProduct(Long id);
List<Product> getAllProducts();



}
