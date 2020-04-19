package com.singtel.assignment;

public class Caterpillar extends Animal{

	private static String voice = "No sound";
	Butterfly butterFly;
	
	@Override
	public String getVoice() {
		return voice;
	}
	
	public Butterfly metamorphosis(){
		butterFly = new Butterfly();
		return butterFly;
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
