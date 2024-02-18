//	06.04.2021

class healthyBurger extends Burgers{
	
	private String healthyExtraName1;
	private double healthyExtraPrice1;
	private String healthyExtraName2;
	private double healthyExtraPrice2;
	
	public healthyBurger(String meat, double price) {
		super("Healthy", "Brown Rye", meat, price);
	}
	
	public void addHealthAddition1(String name, double price) {
		this.healthyExtraName1 = name;
		this.healthyExtraPrice1 = price;
	}
	
	public void addHealthAddition2(String name, double price) {
		this.healthyExtraName2 = name;
		this.healthyExtraPrice2 = price;
	}

	@Override
	public double itemizeBurger() {
		double burgerPrice = super.itemizeBurger();
		if(this.healthyExtraName1 != null) {
			burgerPrice += this.healthyExtraPrice1;
			System.out.println("Added " + this.healthyExtraName1 + " for an extra fee of " + this.healthyExtraPrice1);
		}
		if(this.healthyExtraName2 != null) {
			burgerPrice += this.healthyExtraPrice2;
			System.out.println("Added " + this.healthyExtraName2 + " for an extra fee of " + this.healthyExtraPrice2);
		}
		return burgerPrice;
	}
	
	
	
}//end HeatlhyBurger

class deluxeBurger extends Burgers {

	public deluxeBurger() {
		super("Deluxe", "White", "Sausage & Bacon", 15.54);
		super.addBurgerAdition1("Chips", 2.75);
		super.addBurgerAdition2("Drink", 1.81);
	}

	@Override
	public void addBurgerAdition1(String name, double price) {
		System.out.println("Cannot add additional items to a deluxe burger.");
	}

	@Override
	public void addBurgerAdition2(String name, double price) {
		System.out.println("Cannot add additional items to a deluxe burger.");
	}

	@Override
	public void addBurgerAdition3(String name, double price) {
		System.out.println("Cannot add additional items to a deluxe burger.");
	}

	@Override
	public void addBurgerAdition4(String name, double price) {
		System.out.println("Cannot add additional items to a deluxe burger.");
	}
	
	
	
}//end deluce Burger

public class OOPMasterChallengeExercise {

	public static void main(String[] args) {

		Burgers burger = new Burgers("Basic", "White", "Sausage", 3.56);
		double price = burger.itemizeBurger();
		burger.addBurgerAdition1("Tomato", 0.27);
		burger.addBurgerAdition2("Lettuce", 0.75);
		burger.addBurgerAdition3("Cheese", 1.13);
		System.out.println("Total burger price is "+ burger.itemizeBurger() + "\n");
		
		healthyBurger healthyBurger = new healthyBurger("Bacon", 5.67);
		healthyBurger.addBurgerAdition1("Egg", 5.43);
		healthyBurger.addHealthAddition2("Lentils", 3.41);
		System.out.println("Total Healthy Burger Price is " + healthyBurger.itemizeBurger() + "\n");
		
		deluxeBurger deluxeBurger = new deluxeBurger();
		deluxeBurger.addBurgerAdition3("Should not do this", 50.53);
		deluxeBurger.itemizeBurger();

	}//end main

}//end class
