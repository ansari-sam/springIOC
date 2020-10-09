package com.spring.p2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.p1.Hello;

public class Jtc14 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Jtcindia1.xml");
		Hello hello=(Hello) ctx.getBean("hello");
		hello.show();

	}

}
