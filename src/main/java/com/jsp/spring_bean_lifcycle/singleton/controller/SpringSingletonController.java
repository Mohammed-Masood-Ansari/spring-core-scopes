package com.jsp.spring_bean_lifcycle.singleton.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.spring_bean_lifcycle.singleton.entity.SpringSingleton;

public class SpringSingletonController {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("singleton-application.xml");
		
		SpringSingleton  singleton=(SpringSingleton) applicationContext.getBean("mysingleton");
		
		singleton.incre();
		
		singleton.getCount();
		
		SpringSingleton  singleton1=(SpringSingleton) applicationContext.getBean("mysingleton");
		
		singleton1.incre();
		
		System.out.println(singleton==singleton1);
	}
}
