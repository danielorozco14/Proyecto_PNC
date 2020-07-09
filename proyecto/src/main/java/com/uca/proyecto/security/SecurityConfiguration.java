package com.uca.proyecto.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	UserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService);
	}
	

	 String[] resources = new String[]{
	            "/vendor/**","/css/**","/icons/**","/img/**","/js/**","/scss/**"
	    };
	



	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
		.antMatchers(resources).permitAll()
		.antMatchers("/admin").hasRole("ADMIN")
	
        .antMatchers(resources).permitAll()
		.antMatchers("/user").hasAnyRole("ADMIN","USER")//CAMBIAR "/user" a las rutas que solo un usuario pueda acceder
		.antMatchers("/cat-materias").hasRole("USER")
		.antMatchers("/cat-centros").hasAnyRole("ADMIN","USER")
		.antMatchers("/").permitAll()
		.and()
		.formLogin()
		.loginPage("/login")
		.defaultSuccessUrl("/home")
		.permitAll();
		
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	
	
}
