package com.learn.springcoreone.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new  ClassPathXmlApplicationContext("com/learn/springcoreone/reftype/refconfig.xml");
		Student student = (Student) ctx.getBean("student");
		System.out.println(student.toString());
		

	}

}
