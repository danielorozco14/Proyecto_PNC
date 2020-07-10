package com.uca.proyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.uca.proyecto.formatter.MunicipioFormatter;

@Configuration
@EnableWebMvc
@ComponentScan(value= {"com.uca.proyecto.domain"})//com.uca.proyecto.formatter
public class WebConfig extends WebMvcConfigurerAdapter{
	
	@Autowired
	private MunicipioFormatter muniFormatter;
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(muniFormatter);
	}
	
	

}
