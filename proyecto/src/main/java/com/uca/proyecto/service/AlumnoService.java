package com.uca.proyecto.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.proyecto.domain.Alumno;

public interface AlumnoService {
	
	
	public List<Alumno> findAll() throws DataAccessException;
	
	public Alumno findOne(String id) throws DataAccessException;
	
	public void save(Alumno ce) throws DataAccessException;
	//public void update(Integer idCE, Integer idMuni, String centroEsc, boolean Estado) throws DataAccessException;
	//public void delete(Integer code) throws DataAccessException;
	public List<Alumno> filtrarPor (String Nombre) throws DataAccessException;
	
	
	
	
}
