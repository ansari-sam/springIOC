package com.spring.p2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Jtc16 {

	public static void main(String[] args) {
	
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Jtcindia4.xml");
		
		Hello hello=(Hello) ctx.getBean("hello");
		hello.show();

	}

}
