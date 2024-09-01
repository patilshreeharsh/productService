package com.product.Reposetry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.Entity.Product;

public interface ProductReposetry extends JpaRepository<Product, Long>{

}
