package com.learn.springcoreone.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new  ClassPathXmlApplicationContext("com/learn/springcoreone/set/setconfig.xml");
		CarDealer dealer = (CarDealer) ctx.getBean("dealer");
		System.out.println("Dealer Name : " + dealer.getName());
		System.out.println("Models : " + dealer.getModels());
	}

}
