package com.uca.proyecto.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import com.uca.proyecto.domain.Municipio;
import com.uca.proyecto.service.MunicipioService;

@Service
public class MunicipioFormatter implements Formatter<Municipio> {

	@Autowired
	MunicipioService muniService;

	@Override
	public String print(Municipio object, Locale locale) {
		// TODO Auto-generated method stub
		return (object !=null ? object.getId_municipio().toString():"");
	}

	@Override
	public Municipio parse(String text, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		Integer id = Integer.valueOf(text);
		
		return this.muniService.findOne(id);
	}
	
	

}
