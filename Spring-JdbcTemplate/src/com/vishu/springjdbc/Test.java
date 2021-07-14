package com.vishu.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext ac= new ClassPathXmlApplicationContext("spring_config.xml");
		
		Model o= ac.getBean(Model.class);
		
		springDao sd= ac.getBean(springDao.class);
		
	
		System.out.println(sd.insert(o));
	}

}
