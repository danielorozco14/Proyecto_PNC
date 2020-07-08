package com.uca.proyecto.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(schema = "public", name = "centro_escolar")
public class CentroEscolar {

	@Id
	@Column(name = "id_centro_escolar")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_centro_escolar;
	
	@JoinColumn(name = "id_municipio")
	@ManyToOne(fetch=FetchType.EAGER)
    Municipio id_municipio;

	@NotEmpty(message = "Este campo es obligatorio")
    @Column(name = "centro_escolar")
	private String centroEscolar;
	
	@Column(name = "estado")
	private Boolean estado;


	//@OneToMany(mappedBy="id_centro_escolar",fetch=FetchType.EAGER)
	//List<Alumno> alumnos;


	
	
	public CentroEscolar() {
		
	}	


	/*public List<Alumno> getAlumnos() {
		return alumnos;
	}*/

	/*public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}*/




	public Integer getId_centro_escolar() {
		return id_centro_escolar;
	}

	public void setId_centro_escolar(Integer id_centro_escolar) {
		this.id_centro_escolar = id_centro_escolar;
	}

	public Municipio getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(Municipio id_municipio) {
		this.id_municipio = id_municipio;
	}


	public String getCentroEscolar() {
		return centroEscolar;
	}

	public void setCentroEscolar(String centro_escolar) {
		this.centroEscolar = centro_escolar;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	} 
	
	//Delegate
	
	public String getEstadoDelegate() {
		return (this.estado)?"Activo":"Inactivo";
	}
}
