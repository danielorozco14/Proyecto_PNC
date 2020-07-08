package com.uca.proyecto.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uca.proyecto.domain.Alumno;
import com.uca.proyecto.domain.CentroEscolar;


public interface AlumnoRepository extends JpaRepository<Alumno, String> {
	
	public List<Alumno> findByNombre(String nombre) throws DataAccessException;
	
	public List<Alumno> findByApellido(String apellido) throws DataAccessException;
	
	@Query(nativeQuery = true, value = "SELECT * FROM public.alumno;")
	public List<Alumno> showAll() throws DataAccessException;
	
	@Query(nativeQuery = true, value = "SELECT * FROM public.alumno WHERE nombe = :Nombre")
	public List<Alumno> showByName(String Nombre) throws DataAccessException;	
	
}
