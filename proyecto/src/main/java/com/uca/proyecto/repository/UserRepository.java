package com.uca.proyecto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.proyecto.domain.Usuario;
import com.uca.proyecto.security.User;

public interface UserRepository extends JpaRepository<Usuario, Integer> {
	
	Optional<Usuario> findByUserName(String user_name);

}
