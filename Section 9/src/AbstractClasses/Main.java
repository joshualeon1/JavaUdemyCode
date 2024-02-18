//	08.16.2021

package AbstractClasses;

public class Main {

	public static void main(String[] args) {

		//	Here we use the 'Dog' class that extends to the 'abstract Animal' class that overrides 'breath()' and 'eat()'
		Dog dog = new Dog("Yorkie");
		dog.breath();
		dog.eat();
		
		System.out.println("==========================================");
		
		//	Here we use the 'Parrot' class that extends to the 'abstract Bird' class that ALSO extends to the 'abstract Animal' class
		Parrot parrot = new Parrot("Australian ringneck");
		parrot.breath();
		parrot.eat();
		parrot.fly();
		
		System.out.println("==========================================");
		
		//	Here we use the 'Penguin' class that extends to the 'abstract Bird' class that ALSO extends to the 'abstract Animal' class
		Penguin penguin = new Penguin("Emperor");
		penguin.fly();

	}//end Main
	
}//end Class
