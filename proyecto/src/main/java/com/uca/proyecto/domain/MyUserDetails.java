package com.uca.proyecto.domain;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.uca.proyecto.repository.UserRepository;

@Service
public class MyUserDetails implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;
	

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User>user= userRepository.findByUserName(userName);
		
		user.orElseThrow(()->new UsernameNotFoundException("Not Found: "+userName));//Por si no existe el usuario
		
		return user.map(UsersDetails::new).get();
		
		
	}

}
