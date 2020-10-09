package com.spring.p5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Jtc5 {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("Spring Container is now Ready");
		
		Hello hello=(Hello) ac.getBean("hello");
		hello.show();
		
	}

}
