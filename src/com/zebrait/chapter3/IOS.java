package com.zebrait.chapter3;

import org.springframework.stereotype.Component;


public class IOS implements OperatingSystem{
	@Override
	public void run(){
		System.out.println("IOS is running...");
	}
}
