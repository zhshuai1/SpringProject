package com.zebrait.chapter10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {
	public static void main(String []args){
		ApplicationContext context = new ClassPathXmlApplicationContext("rmi-client-context.xml");
		Waiter waiter=context.getBean(Waiter.class);
		Beer beer=new Beer("Chunsheng", 2, "Tsingtao");
		waiter.updateBeer("beer1", beer);
		waiter.getBeer("beer1");
		System.out.println(beer.getBrand());
		System.out.println(waiter.getBeer("beer1"));
		System.out.println(waiter.getBeer("beer1").getBrand());
	}
}
