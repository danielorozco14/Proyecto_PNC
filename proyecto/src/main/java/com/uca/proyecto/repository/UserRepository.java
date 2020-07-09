package com.uca.proyecto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.proyecto.domain.User;
import com.uca.proyecto.domain.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Integer> {
	
	Optional<Usuario> findByUserName(String user_name);

}
