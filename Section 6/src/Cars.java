//	04.24.2021

public class Cars extends Vehicle{

	//Fields
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;

	//Constructor
	public Cars(String name, String size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}

	//Setters
	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.changeGear(): changed to " + this.currentGear + " gear.");
	}

	//Methods
	public void changeVelocity(int speed, int direction) {
		System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
		move(speed, direction);
	}

}//end class
