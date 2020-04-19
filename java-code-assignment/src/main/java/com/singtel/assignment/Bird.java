package com.singtel.assignment;

public abstract class Bird extends AquaticAnimal implements Singer{

	void fly(){
		System.out.println("I am flying");
	}

	@Override
	public void sing() {
		System.out.println("I am singing");
	}
	
	@Override
	public boolean isFly() {
		return true;
	}
	@Override
	public boolean isSing(){
		return true;
	}

}
