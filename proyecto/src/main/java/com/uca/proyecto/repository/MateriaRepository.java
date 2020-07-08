package com.uca.proyecto.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.uca.proyecto.domain.Materia;

public interface MateriaRepository  extends JpaRepository<Materia, Integer>{
	
	
	public List<Materia> findByMateria(String Nombre) throws DataAccessException;	
	
	@Query(nativeQuery = true, value = "SELECT * FROM public.materia;")
	public List<Materia> showAll() throws DataAccessException;
	
	@Query(nativeQuery=true, value="UPDATE MATERIA SET "
			+ "materia=:Materia,"
			+ "estado=:Estado"
			+ "WHERE id_materia=:idMateria")
	public void updateMateria(Integer idMateria, String Materia, boolean Estado) throws DataAccessException;

	
	@Query(nativeQuery = true, value = "SELECT * FROM public.materia WHERE materia = :Nombre")
	public List<Materia> showByName(String Nombre) throws DataAccessException;	

}
