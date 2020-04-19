package com.singtel.assignment;

public class Counting {

	public static void main(String ar[]){
		Animal[] animals = new Animal[]{
				new Dog(),
				new Parrot(),
				new Cat(),
				new Dolphin()
		};
		int flyingAnimals = 0;
		int wakingAnimals = 0;
		int singingAnimals = 0;
		int swimmingAnimals = 0;
		
		for(Animal animal : animals){
			flyingAnimals = animal.isFly()? flyingAnimals+1:flyingAnimals;
			wakingAnimals = animal.isWalk()? wakingAnimals+1:wakingAnimals;
			singingAnimals = animal.isSing()? singingAnimals+1:singingAnimals;
			swimmingAnimals = animal.isSwim()? swimmingAnimals+1:swimmingAnimals;
		}
		
		System.out.println("Flying animals : "+flyingAnimals);
		System.out.println("Waking Animals : "+wakingAnimals);
		System.out.println("Singing Animals : "+singingAnimals);
		System.out.println("Swimming Animals : "+swimmingAnimals);
		
	}
}
