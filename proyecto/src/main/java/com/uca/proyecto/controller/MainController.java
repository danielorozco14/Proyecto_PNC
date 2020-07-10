package com.uca.proyecto.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.uca.proyecto.domain.CentroEscolar;
import com.uca.proyecto.domain.Municipio;
import com.uca.proyecto.service.CentrosService;
import com.uca.proyecto.service.MunicipioService;

@Controller
public class MainController {

	@Autowired
	CentrosService centroService;
	
	@Autowired
	MunicipioService muniService;
	
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
		/*System.out.println("CENTRO ESCOLAR: "+ce.getCentroEscolar());
		
		*/		
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
	public ModelAndView showUpdateForm(@ModelAttribute CentroEscolar ce, @PathVariable("id_centro_escolar") Integer id_centro_escolar,BindingResult result) {

		ModelAndView mav = new ModelAndView();
		try {
			if(result.hasErrors()) {
					mav.setViewName("editCentro");
			}else {
				
				Municipio muni= new Municipio();
//				muni.setId_municipio(Integer.parseInt(result.getFieldValue("id_municipio").toString()));
				System.out.println("ID DEL MUNICIPIO: "+ result.getFieldValue("id_municipio").toString());
	//			ce.setId_municipio(muni);
				centroService.save(ce);
				mav.setViewName("catCentros");
			}					
		}catch(Exception e) {
			e.printStackTrace();
		}	
		
		
		return mav;
	}
	
}
