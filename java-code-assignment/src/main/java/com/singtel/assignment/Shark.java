package com.singtel.assignment;

public class Shark extends Fish {
	
	private static String voice = "";
	private static String color="greay";
	private static String size="large";
	private static boolean canEatOtherFish = true;
	
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
