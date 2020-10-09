package com.spring.p5;

public class Hello {
	private A aobj;
	private B bobj;
	
	public Hello() {
		System.out.println(" Hello-----Constructor");
	}
	public void setAobj(A aobj) {
		this.aobj = aobj;
	}
	public void setBobj(B bobj) {
		this.bobj = bobj;
	}
	
	public void show() {
		aobj.showA();
		bobj.showB();
	}
	

}
