package com.SAlvesjr.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SAlvesjr.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
