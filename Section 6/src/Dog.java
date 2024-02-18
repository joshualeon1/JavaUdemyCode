//	04.19.2021

public class Dog extends Animal{

	//Creating fields specific to a dog:
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	//Constructor that extends from the 'Animal' class constructor
	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);																	//'super' is used when extending from another class
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	//Various Methods Below:
	private void chew() {
		System.out.println("Dog.chew() called.");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() called.");
		chew();
		super.eat();																						//Here we extend the method 'eat' from the 'Animal' class and use it here for 'Dog'
	}
	
	public void walk() {
		System.out.println("Dog.walk() called.");
		super.move(5);
	}
	
	public void run() {
		System.out.println("Dog.run() called.");
		move(10);
	}

	private void moveLegs(int speed) {
		System.out.println("Dog.moveLegs() called.");
	}
	
	//An override method to see the difference between move(5); in 'walk' method and using super.move(5);
	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called.");
		moveLegs(speed);
		super.move(speed);
	}
	
	
	
}//end class
