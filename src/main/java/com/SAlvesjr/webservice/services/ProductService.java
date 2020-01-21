package com.SAlvesjr.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SAlvesjr.webservice.entities.Product;
import com.SAlvesjr.webservice.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository userRository;

	public List<Product> findAll() {
		return userRository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = userRository.findById(id);
		return obj.get();
	}

}
