package com.uca.proyecto.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.proyecto.domain.Materia;

public interface MateriaService {
	
	public List<Materia> findAll() throws DataAccessException;
	public Materia findOne(Integer code) throws DataAccessException;
	public void save(Materia ma) throws DataAccessException;
	public void update(Integer idMateria,String Materia, boolean Estado) throws DataAccessException;
	public void delete(Integer code) throws DataAccessException;
	public List<Materia> filtrarPor (String Nombre) throws DataAccessException;

}
