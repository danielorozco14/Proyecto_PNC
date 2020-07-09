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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(schema = "public", name = "Usuario")
public class Usuario {

	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_usuario;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Este campo es obligatorio")
	@Column(name = "fecha_de_nacimiento")
	private Date fecha_de_nacimiento;


	@Column(name = "departamento_de_residencia")
	private Integer departamento;
	
	@Column(name = "municipio_de_residencia")
	private Integer municipio_de_residencia;
	

	@Size(message = "La dirección no puede tener mas de 200 caracteres", max = 200)
	@NotEmpty(message = "Este campo es obligatorio")
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "estado")
	private Boolean estado = false; 
	
	@Size(message = "El nombre de usuario no puede tener mas de 50 caracteres", max = 50)
	@NotEmpty(message = "Este campo es obligatorio")
    @Column(name = "username")
	private String userName;

	@NotEmpty(message = "Este campo es obligatorio")
	@Column(name = "password")
	private String password;

	@NotEmpty(message = "Este campo es obligatorio")
    @JoinColumn(name = "id_rol")
	@ManyToOne(fetch=FetchType.EAGER)
	Rol id_rol ; //Integer id_rol;


    @NotEmpty(message = "Este campo es obligatorio")
	@Column(name = "carnet")
	private String carnet;

	

    public Usuario() {

	}



	public Integer getId_usuario() {
		return id_usuario;
	}



	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}



	public Date getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}



	public void setFecha_de_nacimiento(Date fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}



	public Integer getDepartamento() {
		return departamento;
	}



	public void setDepartamento(Integer departamento) {
		this.departamento = departamento;
	}



	public Integer getMunicipio_de_residencia() {
		return municipio_de_residencia;
	}



	public void setMunicipio_de_residencia(Integer municipio_de_residencia) {
		this.municipio_de_residencia = municipio_de_residencia;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public Boolean getEstado() {
		return estado;
	}



	public void setEstado(Boolean estado) {
		this.estado = estado;
	}



	public String getNombre_de_usuario() {
		return userName;
	}



	public void setNombre_de_usuario(String nombre_de_usuario) {
		this.userName = nombre_de_usuario;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Rol getId_rol() {
		return id_rol;
	}



	public void setId_rol(Rol id_rol) {
		this.id_rol = id_rol;
	}



	public String getCarnet() {
		return carnet;
	}



	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
    
}