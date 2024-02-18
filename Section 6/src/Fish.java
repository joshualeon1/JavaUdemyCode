//	04.20.2021

public class Fish extends Animal{

	//Fields
	private int gills;
	private int eyes;
	private int fins;
	
	//Constructor
	public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}
	
	//Methods Below:
	private void rest() {
		System.out.println("Fish.rest() called.");
	}
	
	private void moveMuscles() {
		System.out.println("Fish.moveMuscles() called.");
	}
	
	private void moveBackFin() {
		System.out.println("Fish.moveBackFin() called.");
	}
	
	public void swim(int speed) {
		moveMuscles();
		moveBackFin();
		super.move(speed);
		System.out.println("Fish.swim() called.");
	}
	
}//end class
