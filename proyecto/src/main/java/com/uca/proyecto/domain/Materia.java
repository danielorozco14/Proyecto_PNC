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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(schema = "public", name = "materia")
public class Materia {

	@Id
	@Column(name = "id_materia")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_materia;
	

	@Column(name = "materia")
    private String materia;
	
	@Column(name = "estado")
	private Boolean estado = false;
	
	@OneToMany(mappedBy="id_materia",fetch=FetchType.EAGER)
	List<AlumnoXMateria> alumnosXmateria;

	public List<AlumnoXMateria> getAlumnos() {
		return alumnosXmateria;
	}

	public void setAlumnos(List<AlumnoXMateria> alumnos) {
		this.alumnosXmateria = alumnos;
	}

	public Materia() {
		
	}

	public Integer getId_materia() {
		return id_materia;
	}

	public void setId_materia(Integer id_materia) {
		this.id_materia = id_materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
	

}
