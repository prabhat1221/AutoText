package com.example.AutoText.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AutoText.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByName(String name);
	
}
