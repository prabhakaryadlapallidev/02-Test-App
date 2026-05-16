package com.dilipit.DI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.dilipit.DI.Emp.Employee;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages ={"com.dilipit"})
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args); 
//ProductDetails pd=context.getBean("product",ProductDetails.class);
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Student s1=context.getBean("student 1",Student.class);
		Student s2=context.getBean("student 2",Student.class);
		System.out.println(s1);
		System.out.println(s2);

/*
		 
Address add=context.getBean("address", Address.class);
add.setDoor_no(1);
add.setStreet_name("yadlapalli vari veedhi");
add.setVillage_name("kakarlamudi");
System.out.println(add);
* 
*  */
		
	/*
	 
emp 
		Employee e=context.getBean("employee",Employee.class);
		e.setEmpid(1);
		e.setEmpname("prabhakar");
		System.out.println(e);
emp 1	
		Employee e1=context.getBean("employee",Employee.class);
		e1.setEmpid(2);
		e1.setEmpname("Divya");
		System.out.println(e1);
* 	
	 */
		
		
		
		
		
		
		//System.out.println(pd);
		/*
		 ApplicationContext context=new AnnotationConfigApplicationContext(ConfigFile2.class,Config.class);

		Student s=(Student) context.getBean("student 1");
		System.out.println(s.getId());
		
		System.out.println(s.getName());
		System.out.println(s.getAddress());
		Address a1=(Address) context.getBean("address 1");
		Address a2=(Address) context.getBean("address 1");
		System.out.println(a1+"       "+a2);
		*/
		
		
		/*
		 * College c1=context.getBean("college 1",College.class);
		College c2=context.getBean("college 2",College.class);
		System.out.println(c1);
		*/
		
	}

}
