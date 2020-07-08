package com.uca.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.proyecto.domain.Materia;
import com.uca.proyecto.repository.MateriaRepository;

@Service
public class MateriaServiceImpl implements MateriaService {
	

	@Autowired
	MateriaRepository materiaRepo;

	@Override
	public List<Materia> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return materiaRepo.findAll();
	}

	@Override
	public Materia findOne(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		return materiaRepo.getOne(code);
	}

	@Override
	public void save(Materia ma) throws DataAccessException {
		// TODO Auto-generated method stub
		materiaRepo.save(ma);
	}

	@Override
	public void update(Integer idMateria, String Materia, boolean Estado) throws DataAccessException {
		// TODO Auto-generated method stub
		materiaRepo.updateMateria(idMateria, Materia, Estado);
		
	}

	@Override
	public void delete(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		materiaRepo.deleteById(code);
		
	}

	@Override
	public List<Materia> filtrarPor(String Nombre) throws DataAccessException {
		// TODO Auto-generated method stub
		return materiaRepo.findByMateria(Nombre);
	}

	
	
	

}
