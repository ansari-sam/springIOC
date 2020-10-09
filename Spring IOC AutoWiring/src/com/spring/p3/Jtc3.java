package com.spring.p3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Jtc3 {
	public static void main(String []args) {
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
	
	Hello hello=(Hello)ctx.getBean("hello");
	hello.show();
	}
}
