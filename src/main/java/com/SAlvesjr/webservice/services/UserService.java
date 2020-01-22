package com.SAlvesjr.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.SAlvesjr.webservice.entities.User;
import com.SAlvesjr.webservice.repositories.UserRepository;
import com.SAlvesjr.webservice.services.exceptions.DatabaseException;
import com.SAlvesjr.webservice.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRository;

	public List<User> findAll() {
		return userRository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = userRository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User Insert(User user) {
		return userRository.save(user);
	}

	public void delete(Long id) {
		try {
			userRository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	public User update(Long id, User obj) {
		User entity = userRository.getOne(id);
		updateData(entity, obj);
		return userRository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setNome(obj.getNome());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}

}
