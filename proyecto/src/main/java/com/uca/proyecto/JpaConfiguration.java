package com.uca.proyecto;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


@Configuration
public class JpaConfiguration {
		
		private String user="postgres";
		private String pass="root";
		
		
		@Bean
		public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
			LocalContainerEntityManagerFactoryBean em= new LocalContainerEntityManagerFactoryBean();
			em.setDataSource(dataSource());
			em.setPersistenceUnitName("proyecto");
			em.setPackagesToScan("com.uca.proyecto.domain");
			
			JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
			em.setJpaVendorAdapter(vendorAdapter);
			em.setJpaProperties(hibernateProperties());
			
			return em;
		}
		
		@Bean
		public DataSource dataSource() {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("org.postgresql.Driver");
			dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/springsecurity");//cambiar nombre de BD
			dataSource.setUsername(user);
			dataSource.setPassword(pass);
			
			return dataSource;
		}
		
		public Properties hibernateProperties() {
			Properties properties = new Properties();
			properties.setProperty("hibernate.show_sql", "true");
			
			properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
			properties.setProperty("hibernate.enable_lazy_load_no_trans","true");
			return properties;
		}

}


