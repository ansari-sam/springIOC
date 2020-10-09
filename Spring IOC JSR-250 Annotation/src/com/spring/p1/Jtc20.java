package com.spring.p1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Jtc20 {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("Jtcindia.xml");
		System.out.println ("spring container is Ready…");
		System.out.println("............");
		Hello hello=(Hello)ctx.getBean("Hello");
		hello.show();
		System.out.println(".............");
		System.out.println("spring container going to shutdown..");
		ctx.registerShutdownHook();

	}

}
