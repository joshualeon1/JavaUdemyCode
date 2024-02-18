//	06.03.2021
//Polymorphism Challenge

class CarP {
	
	//Fields
	private boolean engine;
	private int cylinders;
	private int wheels;
	private int doors;
	private String color;
	private String name;
	
	//Constructor
	public CarP(int cylinders, String name, int doors, String color) {
		this.wheels = 4;
		this.engine = true;
		this.cylinders = cylinders;
		this.name = name;
		this.doors = doors;
		this.color = color;
	}

	//Methods
	public String startEngine() {
		return "Starting engine.";
	}
	
	public String accelerate() {
		return "Accelerating.";
	}
	
	public String brake() {
		return "Breaking.";
	}
	
	//Getters and Setters
	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}//end Car

class DodgeCharger extends CarP{

	public DodgeCharger() {
		super(8, "Dodge Charger", 4, "Mute black");
	}

	@Override
	public String startEngine() {
		return getClass().getSimpleName() + ", starting engine.";	//The 'getClass().getSimpleName()' function basically just goes and retrieves the name of the class the function is within and returns it here as String
	}

	@Override
	public String accelerate() {
		return getClass().getSimpleName() + ", accelerating.";
	}

	@Override
	public String brake() {
		return getClass().getSimpleName() + ", breaking.";
	}
	
	
	
}

class DodgeChallenger extends CarP{

	public DodgeChallenger() {
		super(8, "Dodge Challenger", 2, "Mute black");
	}

	@Override
	public String startEngine() {
		return getClass().getSimpleName() + ", starting engine.";
	}

	@Override
	public String accelerate() {
		return getClass().getSimpleName() + ", accelerating.";
	}

	@Override
	public String brake() {
		return getClass().getSimpleName() + ", breaking.";
	}
	
	
	
}

class ToyotaSupra extends CarP{

	public ToyotaSupra() {
		super(6, "Toyota Supra", 2, "White");
	}
	
}

public class CarV2 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 6; i++) {
			CarP car = randomCar();
			System.out.println("Car #" + i + " : " + car.getName() + "\nCar Color: " + car.getColor() + "\nCylinders: " + car.getCylinders() + "\nNumber of doors: " + car.getDoors() + "\n" + car.startEngine() + "\n"
					+ car.accelerate() + "\n" + car.brake() + "\n");
		}
		
	}//end main
	
public static CarP randomCar() {
		
		int randomNumber = (int)(Math.random() * 3) +1;
		System.out.println("Random number generated was: " + randomNumber);
		switch(randomNumber) {
		case 1:
			return new DodgeCharger();
		case 2:
			return new DodgeChallenger();
		case 3:
			return new ToyotaSupra();
		}
		
		return null;
		
	}//end randomMovie()
	
}//end class
