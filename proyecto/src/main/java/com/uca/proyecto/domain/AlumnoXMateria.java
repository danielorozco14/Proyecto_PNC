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
//@Table(schema = "public", name = "alumnoxmateria")
public class AlumnoXMateria {

	
	   @NotEmpty(message = "Este campo es obligatorio")
		@Column(name = "carnet")
		private String carnet;
	

	@NotEmpty(message = "Este campo es obligatorio")
    @Column(name = "id_materia")
	private int id_materia;
	
	@NotEmpty(message = "Este campo es obligatorio")
    @Column(name = "anio")
	private int anio;
	
	@NotEmpty(message = "Este campo es obligatorio")
    @Column(name = "ciclo")
	private int ciclo;
	
	@NotEmpty(message = "Este campo es obligatorio")
    @Column(name = "nota")
	private int nota;
	
	@NotEmpty(message = "Este campo es obligatorio")
    @Column(name = "resultado")
	private String resultado;
	
	

	public AlumnoXMateria() {
		
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public int getId_materia() {
		return id_materia;
	}

	public void setId_materia(int id_materia) {
		this.id_materia = id_materia;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getCiclo() {
		return ciclo;
	}

	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	
}
