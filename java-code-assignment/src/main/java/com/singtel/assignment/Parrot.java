package com.singtel.assignment;

public class Parrot extends Bird{

	Animal neighbor;
	
	public void livesWith(AnimalType animalType){
		AnimalFactory animalFactory = AnimalFactory.getAnimalFactory();
		neighbor = animalFactory.getAnimal(animalType);
	}
	
	@Override
	public String getVoice() {
		if(neighbor == null) {
			System.out.println("Please set liveWith");
		}
		
		return neighbor.getVoice();
	}
	
	@Override
	public boolean isSwim(){
		return false;
	}
	
}
