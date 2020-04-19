package com.singtel.assignment;


public class Dolphin extends AquaticAnimal{

	private static String voice = "";
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
	
}
