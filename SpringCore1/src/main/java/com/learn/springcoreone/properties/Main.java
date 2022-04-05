package com.learn.springcoreone.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new  ClassPathXmlApplicationContext("com/learn/springcoreone/properties/propsconfig.xml");
		CountriesAndLangs country = (CountriesAndLangs) ctx.getBean("countryAndLangs");
		System.out.println(country.toString());
		

	}

}
