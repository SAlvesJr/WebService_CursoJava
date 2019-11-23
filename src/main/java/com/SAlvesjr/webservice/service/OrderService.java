package com.SAlvesjr.webservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SAlvesjr.webservice.entities.Order;
import com.SAlvesjr.webservice.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository OrderRository;

	public List<Order> findAll() {
		return OrderRository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = OrderRository.findById(id);
		return obj.get();
	}

}
