package com.spring.p2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Jtc2 {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("Jtcindia.xml");
		System.out.println("Container is Ready");
		
		Customer Cust=(Customer)ac.getBean("cust");
		Cust.show();

	}

}
