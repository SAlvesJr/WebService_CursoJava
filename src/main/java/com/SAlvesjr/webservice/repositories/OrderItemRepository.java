package com.SAlvesjr.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SAlvesjr.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
