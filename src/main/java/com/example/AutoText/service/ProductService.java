package com.example.AutoText.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AutoText.entity.Product;
import com.example.AutoText.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public Product saveProduct(Product product) {
		return repo.save(product);
	}
	public List<Product> saveProducts(List<Product> products) {
		return repo.saveAll(products);
	}
	public List<Product> getProducts(){
		return repo.findAll();
	}
	public Product getProductById(int id) {
		return repo.findById(id).orElse(null);
	}
	public Product getProductByName(String name) {
		return repo.findByName(name);
	}
	public String deleteProductById(int id) {
		repo.deleteById(id);
		return "delete id is : " + id;
	}
	public Product updateProduct(Product product) {
		Product exitingProduct = repo.findById(product.getId()).orElse(null);
		exitingProduct.setName(product.getName());
		exitingProduct.setQuantity(product.getQuantity());
		exitingProduct.setPrice(product.getPrice());
		return repo.save(exitingProduct);
	}
}
