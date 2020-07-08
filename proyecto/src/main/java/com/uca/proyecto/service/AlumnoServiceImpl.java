package com.uca.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.proyecto.domain.Alumno;
import com.uca.proyecto.repository.AlumnoRepository;


@Service
public class AlumnoServiceImpl implements AlumnoService {
		
	
	@Autowired
	AlumnoRepository alumnoRepo;

	@Override
	public List<Alumno> findAll() throws DataAccessException {
		
		return alumnoRepo.findAll();
	}

	@Override
	public Alumno findOne(String id) throws DataAccessException {
		// TODO Auto-generated method stub
		return alumnoRepo.getOne(id);		
	}

	@Override
	public void save(Alumno ce) throws DataAccessException {
		// TODO Auto-generated method stub
		alumnoRepo.save(ce);		
	}

	@Override
	public List<Alumno> filtrarPor(String Nombre) throws DataAccessException {
		// TODO Auto-generated method stub
		return alumnoRepo.findByNombre(Nombre);
	}	
	
}
