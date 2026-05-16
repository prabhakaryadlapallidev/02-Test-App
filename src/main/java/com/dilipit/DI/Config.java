package com.dilipit.DI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean("address 1")
	public Address address() {
		Address add=new Address();
		add.setDoor_no(1234);
		add.setStreet_name("thota vari veedhi");
		add.setVillage_name("kakarlamudi");
		return add;
	}
	
	
	@Bean("student 1")
	public Student student(@Qualifier("address 1") Address add) {
		Student s=new Student();
//		s.setAddress(add);
//		s.setId(190031778);
//		s.setName("prabhakar");
		return s;
	}
	
	@Bean("student 2")
	public Student student1(@Qualifier("address 1") Address add) {
		Student s=new Student();
		//s.setAddress(add);
		return s;
	}
	
	
	
}
