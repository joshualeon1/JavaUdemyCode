//	06.04.2021
//OOP Master Challenge Exercise

public class Burgers {

	//Fields
	private String name;
	private String breadRollType;
	private String meat;
	private double price;

	private String additionName1;
	private double additionPrice1;
	private String additionName2;
	private double additionPrice2;
	private String additionName3;
	private double additionPrice3;
	private String additionName4;
	private double additionPrice4;

	//Constructor
	public Burgers(String name, String breadRollType, String meat, double price) {
		this.name = name;
		this.breadRollType = breadRollType;
		this.meat = meat;
		this.price = price;
	}
	
	//Methods
	public void addBurgerAdition1(String name, double price) {
		this.additionName1 = name;
		this.additionPrice1 = price;
	}

	public void addBurgerAdition2(String name, double price) {
		this.additionName2 = name;
		this.additionPrice2 = price;
	}

	public void addBurgerAdition3(String name, double price) {
		this.additionName3 = name;
		this.additionPrice3 = price;
	}

	public void addBurgerAdition4(String name, double price) {
		this.additionName4 = name;
		this.additionPrice4 = price;
	}

	public double itemizeBurger() {
		double burgerPrice = this.price;
		System.out.println(this.name + " burger on a " + this.breadRollType + " roll with " + this.meat + " price is " + this.price);
		if(this.additionName1 != null) {
			burgerPrice += this.additionPrice1;
			System.out.println("Added " + this.additionName1 + " for an extra fee of " + this.additionPrice1);
		}
		if(this.additionName2 != null) {
			burgerPrice += this.additionPrice2;
			System.out.println("Added " + this.additionName2 + " for an extra fee of " + this.additionPrice2);
		}
		if(this.additionName3 != null) {
			burgerPrice += this.additionPrice3;
			System.out.println("Added " + this.additionName3 + " for an extra fee of " + this.additionPrice3);
		}
		if(this.additionName4 != null) {
			burgerPrice += this.additionPrice4;
			System.out.println("Added " + this.additionName4 + " for an extra fee of " + this.additionPrice4);
		}
		return burgerPrice;
	}

}//end class
