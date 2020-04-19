package com.singtel.assignment;

public class Dog extends Animal {
	
	static final String voice = "Woof, woof";
	
	@Override
	public String getVoice() {
		return voice;
	}

	@Override
	public boolean isFly() {
		return false;
	}

	@Override
	public boolean isSing() {
		return false;
	}

	@Override
	public boolean isSwim() {
		return false;
	}
	
}
