package com.jsp.spring_bean_lifcycle.singleton.entity;

public class SpringSingleton {

	private int count =0;
	
	
	
	
	public SpringSingleton() {
		super();
		System.out.println("singleton no argument constructor");
	}

	public void incre() {
		count++;
		System.out.println(count);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
