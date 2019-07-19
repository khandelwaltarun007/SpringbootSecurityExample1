package com.springboot.security.example1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.security.example1.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);
}
