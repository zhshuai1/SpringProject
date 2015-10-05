package com.zebrait;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightStory {
	public static void main(String []args){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
		Knight knight=(Knight)context.getBean("knight");
		
		knight.embark();
	}

}
