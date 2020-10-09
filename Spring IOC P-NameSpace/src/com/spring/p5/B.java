package com.spring.p5;

public class B {
	private int b;
	private String msg;
	
	public B() {
		System.out.println(" B-----Constructor");
	}
	
	public void setB(int b) {
		this.b = b;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void showB() {
		System.out.print(b);
		System.out.println("\t"+msg);
	}
	

}
