package com.spring.p3;

public class A {
	private int a;
	private String msg;
	
	public void seta(int a) {
	this.a=a;
		}
	
	public void setMsg(String msg) {
	this.msg=msg;
	}
	
	public String toString(){
	
		return""+a+"\t"+ msg;
	}
}
