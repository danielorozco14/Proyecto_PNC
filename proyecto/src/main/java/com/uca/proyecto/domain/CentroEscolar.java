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
//@Table(schema = "public", name = "centro_escolar")
public class CentroEscolar {

	@Id
	@Column(name = "id_centro_escolar")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_centro_escolar;
	
	@Column(name = "id_municipo")
    private Integer id_municipio;

	
	   @NotEmpty(message = "Este campo es obligatorio")
		@Column(name = "carnet")
		private String carnet;
	

	@NotEmpty(message = "Este campo es obligatorio")
    @Column(name = "centro_escolar")
	private String centro_escolar;
	
	@Column(name = "estado")
	private Boolean estado;

	
	
	public CentroEscolar() {
		
	}

	public Integer getId_centro_escolar() {
		return id_centro_escolar;
	}

	public void setId_centro_escolar(Integer id_centro_escolar) {
		this.id_centro_escolar = id_centro_escolar;
	}

	public Integer getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(Integer id_municipio) {
		this.id_municipio = id_municipio;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public String getCentro_escolar() {
		return centro_escolar;
	}

	public void setCentro_escolar(String centro_escolar) {
		this.centro_escolar = centro_escolar;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	} 
	
	
}
