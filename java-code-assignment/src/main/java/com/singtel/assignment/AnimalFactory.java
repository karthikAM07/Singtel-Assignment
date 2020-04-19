package com.singtel.assignment;

public class AnimalFactory {

	public static AnimalFactory animalFactory;
	
	/**
	 * Making it Singleton 
	 */
	private AnimalFactory(){}
	
	public static AnimalFactory getAnimalFactory(){
		if(animalFactory == null) animalFactory = new AnimalFactory();
		return animalFactory;
	}
	
	public Animal getAnimal(AnimalType animalType) {
		Animal animal = null;
		switch (animalType) {
		case Dog:
			animal = new Dog();
			break;
		case Cat:
			animal = new Cat();
			break;
		case rooster:
			animal = new Rooster();
			break;
		default:
		}
		return animal;
	}
	
}
