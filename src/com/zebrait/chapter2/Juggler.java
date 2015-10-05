package com.zebrait.chapter2;

import java.util.prefs.BackingStoreException;

public class Juggler implements Performer{
	private String name="";
	private int bagNum=3;

	public Juggler() {
		// TODO Auto-generated constructor stub
	}
	
	public Juggler(int bagNum,int name){
		this.name="name"; 
		this.bagNum=0;
	}
	public Juggler(String name, int bagNum){
		this.name=name;
		this.bagNum=bagNum;
	}
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println(name+"is playing with "+bagNum+" bags...");
		
	}		
}
