package com.spring.p1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Hello implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware{
	int x;
	String str;
	String msg;
	String bname;
	
	@Autowired
	A aobj;
	B bobj;
	
	ApplicationContext ctx1;
	BeanFactory factory1;
	@Autowired
	ApplicationContext ctx2;
	@Autowired
	BeanFactory factory2;
	
	static {
		System.out.println("hello static block.........");
	}
	public Hello(int x) {
		System.out.println("Hello ..(int x)");
	}
	
	public void setStr(String str) {
		System.out.println("hello-setStr()");
		System.out.println(aobj);
		System.out.println(bobj);
		this.str=str;
		}
	public void setBobj(B bobj){
		System.out.println("hello-setBobj()");
		this.bobj=bobj;
		}
	@PostConstruct
	public void init1(){
	System.out.println("Hello-init1()");
	msg="welcome to jtc";
	if (str==null){
	str="Hai Guys";
	}
	}
	@PostConstruct
	public void init2() {
	System.out.println("hello-init2()");
	msg="welcome to jtc";
	if(str==null){
	str="Hai Guys";
	}
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Hello-after Properties Set()");
		msg="welcome to jtc";
		if(str==null){
		str="Hai Guys";
		}
			}
	public void myinit() {
	System.out.println ("Hello-mylnit()");
	msg="welcome to jtc";
	if(str==null){
	str="hai Guys";
	}
	}

	@Override
	public void setBeanName(String bname) {
		System.out.println("Hello-setBean Name()");
		this.bname=bname;
		
	}

	@Override
	public void setBeanFactory(BeanFactory factory1) throws BeansException {
		System.out.println("Hello set bean Factory()");
		this.factory1=factory1;
		
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx1) throws BeansException {
		System.out.println("Hello set Application Context()");
		this.ctx1=ctx1;
			}
	
	@PreDestroy
	public void cleanup(){
	System.out.println("hello-cleanup()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Hello-destrohy()");
		
	}
	public void mycleanup(){
		System.out.println("Hello-mycleanup()");
		}
	
	public void show() {
		System.out.println("Hello show ()..");
		System.out.println(x);
		System.out.println(msg);
		System.out.println(str);
		System.out.println(bobj);
		System.out.println("Bean name is:"+bname);
		System.out.println(factory1);
		System.out.println(ctx1);
		System.out.println(factory2);
		System.out.println(ctx2);
		System.out.println(ctx1==ctx2);
		System.out.println(factory1==factory2);
		
	}

}
