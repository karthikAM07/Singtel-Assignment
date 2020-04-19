package com.singtel.assignment;

public class Chiken extends Bird {

	static final String voice = "Cluck, cluck";

	@Override
	public String getVoice() {
		return voice;
	}
	
	@Override
	public void fly(){
		System.out.println("I can not fly");
	}

	@Override
	public boolean isSwim() {
		return false;
	}
	
	@Override
	public boolean isFly(){
		return false;
	}
	
	
}
