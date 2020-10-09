package com.spring.p1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object obj, String bname) throws BeansException {
		System.out.println("postProcessAfterInitialization");
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String bname) throws BeansException {
		System.out.println("postProcessBeforeInitialization");
		return obj;
	}

}
