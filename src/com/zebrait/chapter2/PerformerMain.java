package com.zebrait.chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PerformerMain {
	public static void main(String []args){
		ApplicationContext context = new ClassPathXmlApplicationContext("performer-context.xml");
		Performer duke=context.getBean("duke",Performer.class);
		duke.perform();
		Performer jim=context.getBean("jim",Juggler.class);
		jim.perform();
	}

}
