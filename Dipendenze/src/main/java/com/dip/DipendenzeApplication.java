package com.dip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("/")
@ComponentScan({"com.dip"})
public class DipendenzeApplication {
   
	@Autowired
	@Qualifier("confPersonaDue")
	Persona per;
	
	public static void main(String[] args) {
		SpringApplication.run(DipendenzeApplication.class, args);
		
	} 
	
	@RequestMapping("/")
	public void mioMetodo() {
		System.out.println("Ciao "+per.getNome()+"  "+per.getCognome());
	}

}
