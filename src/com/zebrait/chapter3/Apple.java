package com.zebrait.chapter3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Apple implements MobilePhone{
	@Qualifier("IOS")
	@Autowired
	private OperatingSystem operatingSystem;
	@Autowired
	private Processor processor;
	@Value("IPhone")
	private String brand;

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		processor.process();
		operatingSystem.run();
		System.out.println(brand+" is sending a message...");
		
	}

	@Override
	public void telephone() {
		// TODO Auto-generated method stub
		processor.process();
		operatingSystem.run();
		System.out.println(brand+" is making a call...");
	}
	
}
