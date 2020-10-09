package com.spring.p5;

public class A {
	private int a;
	private String msg;
	
	public A() {
		System.out.println(" A-----Constructor");
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void showA() {
		System.out.print(a);
		System.out.println("\t"+msg);
	}
	

}
