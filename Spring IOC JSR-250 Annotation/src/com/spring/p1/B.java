package com.spring.p1;

import javax.annotation.*;

public class B {
	private int b;
	private String str;
	
	static {
		System.out.println("B-Static block");
	}
	public B() {
		System.out.println("B-default const...");
	}
	
	public B(int b,String str) {
		System.out.println("B-param...const......");
		this.b=b;
		this.str=str;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("B-init.....");
	}
	
	public String toString() {
		
		return ""+ b+ "\t"+str;
	}

}
