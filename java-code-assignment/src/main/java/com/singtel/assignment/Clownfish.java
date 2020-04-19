package com.singtel.assignment;

public class Clownfish extends Fish {
	
	private static String voice = "";
	private static String color="colourful(orange)";
	private static String size="small";
	private static boolean canEatOtherFish = false;


	@Override
	public String getVoice() {
		return voice;
	}


	public static String getColor() {
		return color;
	}


	public static String getSize() {
		return size;
	}


	public static boolean isCanEatOtherFish() {
		return canEatOtherFish;
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
