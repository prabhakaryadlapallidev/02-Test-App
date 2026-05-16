package com.dilipit.DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigFile2 {

	@Bean("college 1")
	public College getcollege1() {
		College c2=new College();
		c2.setClg_name("VIT AP");
		c2.setCount(600);
		return c2;
	}
	
	
	@Bean("college 2")
	public College getcollege() {
		College c1=new College();
		c1.setClg_name("KLU");
		c1.setCount(500);
		return c1;
	}
	
	
	
}
