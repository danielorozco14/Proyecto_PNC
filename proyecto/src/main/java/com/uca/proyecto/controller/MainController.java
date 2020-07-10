package com.uca.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.uca.proyecto.domain.CentroEscolar;
import com.uca.proyecto.service.CentrosService;

@Controller
public class MainController {

	@Autowired
	CentrosService centroService;
	
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
	public ModelAndView catCentros() {
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
	
}
