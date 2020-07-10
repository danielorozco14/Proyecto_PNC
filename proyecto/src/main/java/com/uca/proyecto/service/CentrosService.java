package com.uca.proyecto.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.proyecto.domain.CentroEscolar;

public interface CentrosService {
	
	public List<CentroEscolar> findAll() throws DataAccessException;
	public CentroEscolar findOne(Integer code) throws DataAccessException;
	public void save(CentroEscolar ce) throws DataAccessException;
	public void update(Integer idCE, Integer idMuni, String centroEsc, boolean Estado) throws DataAccessException;
	public void delete(Integer code) throws DataAccessException;
	public List<CentroEscolar> filtrarPor (String Nombre) throws DataAccessException;
	
	
	
}
