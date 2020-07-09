package com.uca.proyecto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.proyecto.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByUserName(String user_name);

}
