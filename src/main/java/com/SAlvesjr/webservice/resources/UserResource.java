package com.SAlvesjr.webservice.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SAlvesjr.webservice.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	public ResponseEntity<User> findAll(){
		return ResponseEntity.ok(new User());
	}
}
