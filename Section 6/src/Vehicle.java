//	04.24.2021

public class Vehicle {
	
	//Fields
	private String name;
	private String size;
	private int currentVelocity;
	private int currentDirection;
	
	//Constructor
	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		this.currentVelocity = 0;
		this.currentDirection = 0;
	}
	
	//Methods
	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
	}
	
	public void move(int velocity, int direction) {
		currentVelocity = velocity;
		currentDirection = direction;
		System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
	}
	
	public void stop() {
		this.currentVelocity = 0;
	}

	//Getters
	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

}//end class
