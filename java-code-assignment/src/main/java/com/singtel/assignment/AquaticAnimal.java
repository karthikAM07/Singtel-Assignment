package com.singtel.assignment;

import com.singtel.assignment.Animal;

public abstract class AquaticAnimal extends Animal {
	
	public void swim(){
		System.out.println("I can swim");
	}

	@Override
	public boolean isSwim() {
		return true;
	}

}
