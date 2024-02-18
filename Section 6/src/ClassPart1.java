//	04.13.2021

public class ClassPart1 {

	public static void main(String[] args) {

		//Here we've created a variable of data type 'Car' which uses the Car class object we previously made
		Car porsche = new Car();
		Car holden = new Car();
		
		//Here we set 'porsche model' value equal to the String label "Carrera"
		porsche.setModel("Carrera");			//if this was changed to 'model' set to "911" then the code below outputs, "Model is Unknown" due to the test in the Car class object
		
		//Output the model of the porsche below:
		System.out.println("Model is " + porsche.getModel());

	}//end main

}//end class
