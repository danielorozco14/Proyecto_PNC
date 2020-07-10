package com.uca.proyecto.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uca.proyecto.domain.CentroEscolar;
import com.uca.proyecto.domain.Municipio;

public interface MunicipiosRepository extends JpaRepository<Municipio, Integer> {

	@Query(nativeQuery = true, value = "SELECT * FROM public.municipio;")
	public List<Municipio> showAll() throws DataAccessException;
	
	public List<Municipio> findByMunicipio(String municipio) throws DataAccessException;	
}
