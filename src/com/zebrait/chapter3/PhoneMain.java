package com.zebrait.chapter3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PhoneMain {
	public static void main(String [] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("phone-context.xml");
		MobilePhone sumsun=(MobilePhone)context.getBean("sumsun");
		sumsun.sendMessage();
		MobilePhone ipone6s=context.getBean("iphone6s",Apple.class);
		ipone6s.telephone();
		MobilePhone iphone4s=context.getBean("iphone4s",Apple.class);
		iphone4s.sendMessage();
		
	}
}
