package com.spring.p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Jtc13 {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Jtcindia.xml");
		Hello hello=(Hello) ctx.getBean("hello");
		hello.show();

	}

}
