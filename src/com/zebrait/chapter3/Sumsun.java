package com.zebrait.chapter3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Sumsun implements MobilePhone{
	@Autowired
	private OperatingSystem android;
	@Autowired
	private Processor processor;
	@Value("Sumsun")
	private String brand;

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		processor.process();
		android.run();
		System.out.println(brand+" is sending a message...");
		
	}

	@Override
	public void telephone() {
		// TODO Auto-generated method stub
		processor.process();
		android.run();
		System.out.println(brand+" is making a call...");
	}
	
}
