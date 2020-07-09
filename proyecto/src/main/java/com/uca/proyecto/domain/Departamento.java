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
//@Table(schema = "public", name = "departamento")
public class Departamento {

	@Id
	@Column(name = "id_departamento")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_departamento;
	

	@Column(name = "departamento")
    private String departamento;


	public Departamento() {
		
	}


	public Integer getId_departamento() {
		return id_departamento;
	}


	public void setId_departamento(Integer id_departamento) {
		this.id_departamento = id_departamento;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	


}
