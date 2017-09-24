package com.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.services.model.DevApplication;
import com.services.repo.DevAppRepo;

@SpringBootApplication
@EnableJpaRepositories
public class SampleApplication {

	
	
	public static void main(String[] args) {
//	ConfigurableApplicationContext context=	
			SpringApplication.run(SampleApplication.class, args);
	
//	DevAppRepo d = context.getBean(DevAppRepo.class);
//	d.save(new DevApplication("3"));
//	d.save(new DevApplication("4"));
	
	
	}
	
}
