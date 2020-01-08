package com.SAlvesjr.webservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SAlvesjr.webservice.entities.Category;
import com.SAlvesjr.webservice.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository Rository;

	public List<Category> findAll() {
		return Rository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = Rository.findById(id);
		return obj.get();
	}

}
