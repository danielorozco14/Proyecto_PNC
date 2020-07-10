package com.uca.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.proyecto.domain.CentroEscolar;
import com.uca.proyecto.domain.Municipio;
import com.uca.proyecto.repository.MunicipiosRepository;

@Service
public class MunicipioServiceImpl implements MunicipioService {

	@Autowired
	MunicipiosRepository munRepo;
	
	@Override
	public List<Municipio> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return munRepo.findAll();
	}

	@Override
	public Municipio findOne(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		return munRepo.getOne(code);
	}

	@Override
	public void save(Municipio ce) throws DataAccessException {
		// TODO Auto-generated method stub
		munRepo.save(ce);
		
	}

	@Override
	public void delete(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		munRepo.deleteById(code);
	}

	@Override
	public List<Municipio> filtrarPor(String Nombre) throws DataAccessException {
		// TODO Auto-generated method stub
		return munRepo.findByMunicipio(Nombre);
	}

}
