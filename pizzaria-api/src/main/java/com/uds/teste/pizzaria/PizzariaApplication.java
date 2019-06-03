package com.uds.teste.pizzaria;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.uds.teste.pizzaria.service", "com.uds.teste.pizzaria.controller"})
@EnableJpaRepositories(basePackages = {"com.uds.teste.pizzaria.persistence"})
@EntityScan("com.uds.teste.pizzaria.model")
public class PizzariaApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PizzariaApplication.class);
	}

	@Bean
    public ModelMapper modelMapper() {
		 ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
    }
	
	public static void main(String[] args) {
		SpringApplication.run(PizzariaApplication.class, args);
	}
}
