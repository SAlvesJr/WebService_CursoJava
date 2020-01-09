package com.SAlvesjr.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SAlvesjr.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
