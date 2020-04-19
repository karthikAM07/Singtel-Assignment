package com.singtel.assignment;

public class Cat extends Animal {

	static final String voice = "Meow";
	
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
