package com.spring.p3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {
	private A aobj;
	private B bobj;
	/*
	@Autowired
	@Qualifier("ao1")
	private A aobj;
	@Autowired
	@Qualifier("bo1")
	private B bobj;
	*/
	@Autowired
	public Hello(@Qualifier("ao1") A ao, @Qualifier("bo1") B bo){
	this.aobj=ao;
	this.bobj=bo;
	}
	
	
	public void show(){
		System.out.println(aobj);
		System.out.println(bobj);
		}
	
}
