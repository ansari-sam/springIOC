package com.spring.p2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Hello {
	private A aobj;
	private B bobj;
	
	@Required
	public void setAobj(A aobj) {
		System.out.println("Hello-SetAobj()");
		this.aobj = aobj;
	}
	
	@Required
	public void setBobj(B bobj) {
		System.out.println("Hello-SetBobj()");
		this.bobj = bobj;
	}




	public void show(){
		System.out.println(aobj);
		System.out.println(bobj);
		}
	
}
