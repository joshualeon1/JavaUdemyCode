//	04.19.2021

public class TestingAnimalDogClass {

	public static void main(String[] args) {

		//Creating animal of type 'Animal' passing in values to initialize in the 'Animal' constructor
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		
		Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
		
		Fish fish = new Fish("Goldfish", 5, 10, 2, 2, 3);
		
		//dog.eat();
		//dog.walk();
		//dog.run();
		fish.swim(10);

	}//end main

}//end class
