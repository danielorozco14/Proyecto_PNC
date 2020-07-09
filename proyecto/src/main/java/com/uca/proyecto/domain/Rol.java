package com.uca.proyecto.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

//@Entity
//@Table(schema = "public", name = "rol")
public class Rol {

	@Id
	@Column(name = "id_rol")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_rol;
	
	@Column(name = "estado")
	private Boolean rol = false;

	public Rol() {
		
	}

	public Integer getId_rol() {
		return id_rol;
	}

	public void setId_rol(Integer id_rol) {
		this.id_rol = id_rol;
	}

	public Boolean getRol() {
		return rol;
	}

	public void setRol(Boolean rol) {
		this.rol = rol;
	}
	
	
}