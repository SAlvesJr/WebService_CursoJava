package com.SAlvesjr.webservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SAlvesjr.webservice.entities.User;
import com.SAlvesjr.webservice.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRository;

	public List<User> findAll() {
		return userRository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = userRository.findById(id);
		return obj.get();
	}

	public User Insert(User user) {
		return userRository.save(user);
	}

}
