package com.uca.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RestController {
	
	
	@GetMapping("/")
	public ModelAndView home() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/user")
	public ModelAndView user() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user");
		
		return mav;
	}
	
	@GetMapping("/admin")
	public ModelAndView admin() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin");
		
		return mav;
	}
	

}
