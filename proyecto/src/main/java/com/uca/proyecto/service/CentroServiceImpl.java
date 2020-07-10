package com.uca.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.proyecto.domain.CentroEscolar;
import com.uca.proyecto.repository.CentrosRepository;

@Service
public class CentroServiceImpl implements CentrosService{
	
	@Autowired
	CentrosRepository centroRepo;
	

	@Override
	public List<CentroEscolar> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return centroRepo.findAll();
	}

	@Override
	public CentroEscolar findOne(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		return centroRepo.getOne(code);
	}

	@Override
	public void save(CentroEscolar ce) throws DataAccessException {
		// TODO Auto-generated method stub
		centroRepo.save(ce);
	}

	@Override
	public void delete(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		centroRepo.deleteById(code);
		
	}

	@Override
	public List<CentroEscolar> filtrarPor(String centro_escolar) throws DataAccessException {
		// TODO Auto-generated method stub
		return centroRepo.findByCentroEscolar(centro_escolar);
	}

}
