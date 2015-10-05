package com.zebrait.chapter10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerMain {
	public static void main(String [] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("rmi-server-context.xml");	
		System.out.println("Beer server starts...");
	}
	
}
