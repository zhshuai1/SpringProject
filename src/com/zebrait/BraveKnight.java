package com.zebrait;

public class BraveKnight implements Knight {
	
	private Minstrel minstrel;
	private Quest quest;
	
	public BraveKnight(Quest quest){
		this.quest=quest;
	}
	public void embark(){
		System.out.println("knight sing before quest");
		quest.embark();
		System.out.println("knight sing after quest");
	}

}
