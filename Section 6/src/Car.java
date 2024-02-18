//	04.13.2021
//	Variables made within a class object are fields, ex: Car has fields - make, model, year, color, etc. 

public class Car {

	//Five fields below:
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	//A setter method
	public void setModel(String model) {
		String validModel = model.toLowerCase();								//converts what we're given to lower case
		if(validModel.equals("carrera") || validModel.equals("commodore")) {	//what we are testing for
			this.model = model;													//this line here updates the variable 'model', also, 'this' is used to reference to the following specific variable
		} else {
			this.model = "Unknown";												//else, 'model' is updated to "Unknown"
		}
		
	}
	
	//A getter method
	public String getModel() {
		return this.model;							//this getter method allows us to access the updated value of 'model' as a String here
	}
	
}//end class
