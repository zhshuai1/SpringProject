package com.zebrait.chapter3;

import org.springframework.stereotype.Component;


public class Android implements OperatingSystem{
	@Override
	public void run(){
		System.out.println("Android is running...");
	}
}
