package com.SAlvesjr.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SAlvesjr.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
