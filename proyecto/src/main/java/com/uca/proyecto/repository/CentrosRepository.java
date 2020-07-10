package com.uca.proyecto.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.uca.proyecto.domain.CentroEscolar;

public interface CentrosRepository extends JpaRepository<CentroEscolar, Integer>{
	
	public List<CentroEscolar> findByCentroEscolar(String Nombre) throws DataAccessException;	
	
	@Query(nativeQuery = true, value = "SELECT * FROM public.centro_escolar;")
	public List<CentroEscolar> showAll() throws DataAccessException;
	
	@Query(nativeQuery = true, value = "SELECT * FROM public.centro_escolar WHERE centro_escolar = :Nombre")
	public List<CentroEscolar> showByName(String Nombre) throws DataAccessException;	
	
	@Query(nativeQuery=true, value="UPDATE CENTRO_ESCOLAR SET "
			+ "id_municipio=:idMunicipio,"
			+ "centro_escolar=:centroEscolar,"
			+ "estado=:Estado"
			+ "WHERE id_centro_escolar=:idCentroEscolar")
	public void updateCentroEscolar(Integer idCentroEscolar, Integer idMunicipio, String centroEscolar, boolean Estado) throws DataAccessException;

}
