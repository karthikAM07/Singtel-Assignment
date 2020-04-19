package com.singtel.assignment;

public class Butterfly extends Bird {
	
	@Override
	public String getVoice() {return "No Voice";}
	
	@Override
	public void sing() {
		System.out.println("I cannot sing");
	}
	@Override
	public void walk(){
		System.out.println("I cannot walk");
	}
	
	@Override
	public void swim(){System.out.println("I cannot swim");}

	@Override
	public boolean isSwim() {
		return false;
	};
	
	@Override
	public boolean isWalk(){
		return false;
	}
	
	@Override
	public boolean isSing(){
		return false;
	}
}
