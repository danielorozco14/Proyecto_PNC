package com.uca.proyecto.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	
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
	
	@RequestMapping("/catalogo-centros")
	public ModelAndView catCentros() {
		ModelAndView mav = new ModelAndView ();
		
		return mav;
	}
	
}
