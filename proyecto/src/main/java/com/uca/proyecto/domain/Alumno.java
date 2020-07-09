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
//@Table(schema = "public", name = "alumno")
public class Alumno {

	
	@NotEmpty(message = "Este campo es obligatorio")
	@Column(name = "carnet")
	private String carnet;


	@NotEmpty(message = "Este campo es obligatorio")
    @Column(name = "nombre")
	private String nombre;
	

	@NotEmpty(message = "Este campo es obligatorio")
    @Column(name = "apellido")
	private String apellido;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Este campo es obligatorio")
	@Column(name = "fecha_de_nacimiento")
	private Date fecha_de_nacimiento;

	@Size(message = "La dirección no puede tener mas de 200 caracteres", max = 200)
	@NotEmpty(message = "Este campo es obligatorio")
	@Column(name = "direccion")
	private String direccion;

	@Column(name = "telefono_fijo")
	private Integer telefono_fijo;
	
	@Column(name = "telefono_movil")
	private Integer telefono_movil;
	

	@NotEmpty(message = "Este campo es obligatorio")
    @Column(name = "nombre_de_padre")
	private String nombre_de_padre;

  
	@NotEmpty(message = "Este campo es obligatorio")
    @Column(name = "nombre_de_madre")
	private String nombre_de_madre;

	
	

	public Alumno() {
	
	}


	public String getCarnet() {
		return carnet;
	}


	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Date getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}


	public void setFecha_de_nacimiento(Date fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Integer getTelefono_fijo() {
		return telefono_fijo;
	}


	public void setTelefono_fijo(Integer telefono_fijo) {
		this.telefono_fijo = telefono_fijo;
	}


	public Integer getTelefono_movil() {
		return telefono_movil;
	}


	public void setTelefono_movil(Integer telefono_movil) {
		this.telefono_movil = telefono_movil;
	}


	public String getNombre_de_padre() {
		return nombre_de_padre;
	}


	public void setNombre_de_padre(String nombre_de_padre) {
		this.nombre_de_padre = nombre_de_padre;
	}


	public String getNombre_de_madre() {
		return nombre_de_madre;
	}


	public void setNombre_de_madre(String nombre_de_madre) {
		this.nombre_de_madre = nombre_de_madre;
	}



 

	

}
