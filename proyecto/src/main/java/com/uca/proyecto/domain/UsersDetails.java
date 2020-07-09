package com.uca.proyecto.domain;

import java.util.Date;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UsersDetails implements UserDetails {
	
	private Integer id_usuario;
	private Date fecha_de_nacimiento;
	private Integer departamento;
	private Integer municipio_de_residencia;
	private String direccion;
	private boolean estado;
	private String userName;//Hecho por mi
	private String password;
	
	private List<GrantedAuthority> authorities;
	
	public UsersDetails(Usuario user) {//Hecho por mi
		this.id_usuario=user.getId_usuario();
		this.fecha_de_nacimiento=user.getFecha_de_nacimiento();
		this.departamento=user.getDepartamento();
		this.municipio_de_residencia=user.getMunicipio_de_residencia();
		this.direccion=user.getDireccion();	
		this.estado=user.getEstado();
		
		this.userName=user.getNombre_de_usuario();
		this.password= user.getPassword();
		
		this.authorities= Arrays.stream(user.getId_rol().getRol().split(","))
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
	}
	
	public UsersDetails() {//Hecho por mi constructor vacio
		
	}
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return estado;
	}

	
}
