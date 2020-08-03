package com.dip;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration

public class Configuration {
	
	@Bean
	@Qualifier("confPersona")
	public Persona confPersona() {
		Persona p = new Persona();	
		p.setNome("Mario");
		p.setCognome("Codamozza");
		return p;
	}
	
	@Bean
	@Qualifier("confPersonaDue")
	public Persona confPersonaDue() {
		Persona p = new Persona();	
		p.setNome("Francesco");
		p.setCognome("Saltalafossa");
		return p;
	}
	
	
	
	
}
