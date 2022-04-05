package com.learn.springcoreone;

 
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("config.xml");
		Employee employee = (Employee) ctx1.getBean("emp");
		System.out.println("Employee id : " + employee.getId());
		System.out.println("Employee name : " + employee.getName());

		
	}

}
