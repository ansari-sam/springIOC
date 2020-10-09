package com.spring.p1;
import javax.annotation.*;
public class A {
	private int a;
	private String msg;
	
	static {
		System.out.println("A-static block");
	}
	public A() {
		System.out.println("A-default const.....");
	}
	
	public void setA(int a) {
		this.a = a;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@PostConstruct
	public void init() {
		System.out.println(" A- init()...");
	}
	public String toString() {
		
		return""+a +"\t" +msg;
	}
}
