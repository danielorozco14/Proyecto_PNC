package com.uca.proyecto.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.proyecto.domain.CentroEscolar;
import com.uca.proyecto.domain.Municipio;

public interface MunicipioService {
	
	public List<Municipio> findAll() throws DataAccessException;
	public Municipio findOne(Integer code) throws DataAccessException;
	public void save(Municipio ce) throws DataAccessException;
	public void delete(Integer code) throws DataAccessException;
	public List<Municipio> filtrarPor (String Nombre) throws DataAccessException;
	
	
	
	
}
