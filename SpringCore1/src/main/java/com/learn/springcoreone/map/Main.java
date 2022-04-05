package com.learn.springcoreone.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new  ClassPathXmlApplicationContext("com/learn/springcoreone/map/mapconfig.xml");
		Customer customer = (Customer) ctx.getBean("customers");
		System.out.println(customer.toString());
		

	}

}
