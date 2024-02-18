//	05.18.2021

public class Case {

	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions dimensions;
	
	//Constructor
	public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}
	
	//Method
	public void pressPower() {
		System.out.println("Power button pressed.");
	}

	//Getters
	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}
	
}//end class
