package com.zebrait.chapter2;

public class Stage {
	private static class StageHolder{
		public static Stage stage=new Stage();
	}
	public static Stage getInstance(){
		return StageHolder.stage;
	}

}
