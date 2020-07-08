package com.uca.proyecto.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.uca.proyecto.domain.CentroEscolar;
import com.uca.proyecto.domain.Materia;
import com.uca.proyecto.domain.Municipio;
import com.uca.proyecto.service.CentrosService;
import com.uca.proyecto.service.MateriaService;
import com.uca.proyecto.service.MunicipioService;

@Controller
public class MainController {

	@Autowired
	CentrosService centroService;
	
	@Autowired
	MunicipioService muniService;
	
	@Autowired
	MateriaService materiaService;
	
	@RequestMapping("/home")
	public ModelAndView homePage() {		
		ModelAndView mav= new ModelAndView();		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username;
		
		
		if(principal instanceof UserDetails) {
			 username = ((UserDetails)principal).getUsername();
		}else {
			 username = principal.toString();
		}
		mav.addObject("username", username);
		
		
		mav.setViewName("home");		
		return mav;
	}
	
	@RequestMapping("/cat-centros")
	public ModelAndView catalogoCentrosEscolares() {
		ModelAndView mav = new ModelAndView ();
		
		List<CentroEscolar> centros = null;
		try {
			centros=centroService.findAll();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		mav.addObject("centrosEscolares", centros);
		mav.setViewName("catCentros");
		
		return mav;
	}
	
	@RequestMapping("/edit/{id_centro_escolar}")/////////// ESTEEE PREPARA LA PAGINA
	public ModelAndView editCentroEscolar(@PathVariable("id_centro_escolar") Integer id_centro_escolar, @ModelAttribute CentroEscolar ce) {
		ModelAndView mav = new ModelAndView();		
		List<Municipio> municipios= muniService.findAll();	
		CentroEscolar centro = new CentroEscolar();
		try {
			centro = centroService.findOne(id_centro_escolar);
		}catch(IllegalArgumentException i) {
			i.printStackTrace();
		}
		mav.addObject("centro", centro);
		mav.addObject("municipios",municipios);
		mav.setViewName("editCentro");
		
		return mav;
	}
	
	@RequestMapping("/update/{id_centro_escolar}")//PARA INGRESAR  CENTRO ESCOLAR EDITADO
	public ModelAndView showUpdateForm(@ModelAttribute CentroEscolar ce , @PathVariable("id_centro_escolar") Integer id_centro_escolar,BindingResult result) {

		ModelAndView mav = new ModelAndView();
		try {
			if(result.hasErrors()) {
					mav.setViewName("editCentro");
			}else {			
				/*Municipio muni = new Municipio();
				
				muni.setId_municipio(Integer.parseInt(result.getFieldValue("id_municipio").toString()));
				System.out.println("HASDFSDFASDJLFADFJSLDFSDF");
				ce.setId_municipio(muni);*/
				
				centroService.save(ce);
				mav.setViewName("catCentros");
			}					
		}catch(Exception e) {
			e.printStackTrace();
		}	
		
		
		return mav;
	}
	@GetMapping("/new")
	public ModelAndView newCentroEscolar() {
		ModelAndView mav = new ModelAndView();		
		
		List<Municipio> municipios= muniService.findAll();
		/*System.out.println("CENTRO ESCOLAR: "+ce.getCentroEscolar());
		
		*/		
<<<<<<< HEAD
		CentroEscolar centro = new CentroEscolar();	
=======
		
		CentroEscolar centro = new CentroEscolar();
	
>>>>>>> 708f767b093c0024ace725fa6f58e8a0df8de3df
		mav.addObject("centro", centro);
		mav.addObject("municipios",municipios);
		mav.setViewName("newCentro");
		
		return mav;
	}
	
	//SAVE
	@RequestMapping("/agregarL")
	public ModelAndView newForm(@ModelAttribute CentroEscolar ce,BindingResult result) {

		ModelAndView mav = new ModelAndView();
		try {
			if(result.hasErrors()) {
					mav.setViewName("newCentro");
			}else {
				centroService.save(ce);
				mav.setViewName("catCentros");
			}					
		}catch(Exception e) {
			e.printStackTrace();
		}	
		
		
		return mav;
	}
	
	
	
	//CONTROLADOR DE CATALOGO DE MATERIA
	@RequestMapping("/cat-materias")
	public ModelAndView catalogoMaterias() {
		ModelAndView mav = new ModelAndView ();
		
		List<Materia> materias = null;
		try {
			materias=materiaService.findAll();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		mav.addObject("materias", materias);
		mav.setViewName("catMateria");
		
		return mav;
	}
	
	@RequestMapping("/edit/materia/{id_materia}")/////////// ESTEEE PREPARA LA PAGINA
	public ModelAndView editMaterias(@PathVariable("id_materia") Integer id_materia, @ModelAttribute Materia ma) {
		ModelAndView mav = new ModelAndView();		
		//List<Municipio> municipios= muniService.findAll();	
		Materia materia = new Materia();
		try {
			materia = materiaService.findOne(id_materia);
		}catch(IllegalArgumentException i) {
			i.printStackTrace();
		}
		mav.addObject("materia", materia);
		//mav.addObject("municipios",municipios);
		mav.setViewName("editMateria");
		
		return mav;
	}
	
	@RequestMapping("/update/materia/{id_materia}")//PARA INGRESAR  CENTRO ESCOLAR EDITADO
	public ModelAndView showUpdateForm(@ModelAttribute Materia ma , @PathVariable("id_materia") Integer id_materia,BindingResult result) {

		ModelAndView mav = new ModelAndView();
		try {
			if(result.hasErrors()) {
					mav.setViewName("editMateria");
			}else {			
				/*Municipio muni = new Municipio();
				
				muni.setId_municipio(Integer.parseInt(result.getFieldValue("id_municipio").toString()));
				System.out.println("HASDFSDFASDJLFADFJSLDFSDF");
				ce.setId_municipio(muni);*/
				Materia mat = new Materia();
				mat.setId_materia(id_materia);
				mat.setMateria(result.getFieldValue("materia").toString());
				mat.setEstado(Boolean.valueOf(result.getFieldValue("estado").toString()));
				
				materiaService.update(id_materia, ma.getMateria(), ma.getEstado());
				mav.setViewName("catMateria");
			}					
		}catch(Exception e) {
			e.printStackTrace();
		}	
		
		
		return mav;
	}
	
	
	
}
