package com.SAlvesjr.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SAlvesjr.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
