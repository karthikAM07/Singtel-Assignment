package com.singtel.assignment;

public abstract class Animal implements Voice{
	void walk(){
		System.out.println("I am walking");
	}
	
	public boolean isWalk() {
		return true;
	}
	
	public abstract boolean isFly();

	public abstract boolean isSing();

	public abstract boolean isSwim();

}
