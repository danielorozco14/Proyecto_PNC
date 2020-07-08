package com.uca.proyecto.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RestController {
	
	
	
	@GetMapping("/user")
	public ModelAndView user() {
		ModelAndView mav = new ModelAndView();
		
		String username;
		/*
		 * TODO 1: Obtiene el objeto Usuario del contexto de seguridad y se guarda en Object principal
		 */
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		if(principal instanceof UserDetails) {
			 username = ((UserDetails)principal).getUsername();
		}else {
			 username = principal.toString();
		}
		mav.addObject("username", username);
		
		mav.setViewName("home");
		
		return mav;
	}
	
	@GetMapping("/admin")
	public ModelAndView admin() {
		
		ModelAndView mav = new ModelAndView();
		
		String username;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		if(principal instanceof UserDetails) {
			 username = ((UserDetails)principal).getUsername();
		}else {
			 username = principal.toString();
		}
		mav.addObject("username", username);
		
		mav.setViewName("home");
		
		return mav;
	}
	

}
