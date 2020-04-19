# Singtel-Assignment


<b>/java-code-assignment/src/main/java/com/singtel/assignment/Animal.java</b>
```
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

```

<b>/java-code-assignment/src/main/java/com/singtel/assignment/AnimalFactory.java</b>
```
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

```

<b>/java-code-assignment/src/main/java/com/singtel/assignment/AnimalType.java</b>

```
package com.singtel.assignment;

public enum AnimalType {
Dog,Cat,rooster;
}

```

<b>/java-code-assignment/src/main/java/com/singtel/assignment/AquaticAnimal.java</b>
```
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

```
<b>/java-code-assignment/src/main/java/com/singtel/assignment/Bird.java</b>
```
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

```

<b>/java-code-assignment/src/main/java/com/singtel/assignment/Butterfly.java</b>
```
package com.singtel.assignment;

public class Butterfly extends Bird {
	
	@Override
	public String getVoice() {return "No Voice";}
	
	@Override
	public void sing() {
		System.out.println("I cannot sing");
	}
	@Override
	public void walk(){
		System.out.println("I cannot walk");
	}
	
	@Override
	public void swim(){System.out.println("I cannot swim");}

	@Override
	public boolean isSwim() {
		return false;
	};
	
	@Override
	public boolean isWalk(){
		return false;
	}
	
	@Override
	public boolean isSing(){
		return false;
	}
}

```

<b>/java-code-assignment/src/main/java/com/singtel/assignment/Cat.java</b>
```
package com.singtel.assignment;

public class Cat extends Animal {

	static final String voice = "Meow";
	
	@Override
	public String getVoice() {
		return voice;
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

```

<b>/java-code-assignment/src/main/java/com/singtel/assignment/Caterpillar.java</b>
```
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

```

<b>/java-code-assignment/src/main/java/com/singtel/assignment/Chiken.java</b>
```
package com.singtel.assignment;

public class Chiken extends Bird {

	static final String voice = "Cluck, cluck";

	@Override
	public String getVoice() {
		return voice;
	}
	
	@Override
	public void fly(){
		System.out.println("I can not fly");
	}

	@Override
	public boolean isSwim() {
		return false;
	}
	
	@Override
	public boolean isFly(){
		return false;
	}
	
	
}

```

<b>/java-code-assignment/src/main/java/com/singtel/assignment/Clownfish.java</b>
```
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

```

<b>/java-code-assignment/src/main/java/com/singtel/assignment/Counting.java</b>
```
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

```

<b>/java-code-assignment/src/main/java/com/singtel/assignment/Dog.java</b>
```
package com.singtel.assignment;

public class Dog extends Animal {
	
	static final String voice = "Woof, woof";
	
	@Override
	public String getVoice() {
		return voice;
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

```

<b>/java-code-assignment/src/main/java/com/singtel/assignment/Dolphin.java</b>
```
package com.singtel.assignment;


public class Dolphin extends AquaticAnimal{

	private static String voice = "";
	@Override
	public String getVoice() {
		return voice;
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

```

<b>/java-code-assignment/src/main/java/com/singtel/assignment/Duck.java</b>
```
package com.singtel.assignment;

public class Duck extends Bird {
	
	static final String voice = "Quack, quack";

	@Override
	public String getVoice() {
		return voice;
	}
	
}
```

<b>/java-code-assignment/src/main/java/com/singtel/assignment/Fish.java</b>
```
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

```
<b>/java-code-assignment/src/main/java/com/singtel/assignment/Parrot.java</b>
```
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

```

<b>/java-code-assignment/src/main/java/com/singtel/assignment/Rooster.java</b>
```
package com.singtel.assignment;

public class Rooster extends Chiken {

	static final String gender = "Male";
	static final String defaultVoice = "Cock-a-doodle-doo";
	String voice;
	
	@Override
	public String getVoice() {
		return voice;
	}
	
	public String getGender(){
		return gender;
	}
	
	public String getVoiceByLanguage(String language){
		switch (language){
		case "Danish":
			voice = "kykyliky";
			break;
		case "Dutch":
			voice = "kukeleku";
			break;
		case "Finnish":
			voice = "kukko kiekuu";
			break;
		case "French":
			voice = "cocorico";
			break;
		case "German":
			voice = "kikeriki";
			break;
		case "Greek":
			voice = "kikiriki";
			break;
		case "Hebrew":
			voice = "coo-koo-ri-koo";
			break;
		case "Hungarian":
			voice = "kukuriku";
			break;
		case "Italian":
			voice = "chicchirichi";
			break;
		case "Japanese":
			voice = "ko-ke-kok-ko-o";
			break;
		case "Portuguese":
			voice = "cucurucu";
			break;
		case "Russian":
			voice = "kukareku";
			break;
		case "Swedish":
			voice = "kuckeliku";
			break;
		case "Turkish":
			voice = "kuk-kurri-kuuu";
			break;
		case "Urdu":
			voice = "kuklooku";
			break;
		default:
			voice = defaultVoice;
			break;	
		}
		
		return voice;
	}

}

```

<b>/java-code-assignment/src/main/java/com/singtel/assignment/Shark.java</b>
```
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

```

<b>/java-code-assignment/src/main/java/com/singtel/assignment/Singer.java</b>
```
package com.singtel.assignment;

public interface Singer {
	public void sing();
}

```
<b>/java-code-assignment/src/main/java/com/singtel/assignment/Voice.java</b>
```
package com.singtel.assignment;

public interface Voice {
	public String getVoice();
}

```

<b>/java-code-assignment/src/test/java/com/singtel/assignment/BirdTest.java</b>
```
package com.singtel.assignment;


import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BirdTest extends TestCase{
	
	public BirdTest( String testName )
    {
        super( testName );
        MockitoAnnotations.initMocks(this);
    }
	
	public static Test suite(){
		return new TestSuite(BirdTest.class);
	}
	
	@InjectMocks
	@Spy
	private Bird bird;
	
	public void testPrintLogs() {
		bird.sing();
        //verifying the interaction to the method
        Mockito.verify(bird).sing();
    }
}

```

# Result
```
Flying animals : 1
Waking Animals : 4
Singing Animals : 1
Swimming Animals : 1

```
![image](https://user-images.githubusercontent.com/63912537/79681112-c9e9fd00-8249-11ea-9379-ff28bdd7aa53.png)
