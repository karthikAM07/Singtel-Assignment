package com.singtel.assignment;

public abstract class Fish extends AquaticAnimal implements Singer {
	
	@Override
	public void walk(){
		System.out.println("I can not walk");
	}
	
	@Override
	public void sing(){
		System.out.println("I can not sing");
	}
}
