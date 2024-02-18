//	04.06.2021

public class ParsingValuesFromString {

	public static void main(String[] args) {

		String numberAsString = "2018.125";
		System.out.println("numberAsString = " + numberAsString);
		
		double number = Double.parseDouble(numberAsString);	//here we use the Double class
		System.out.println("number = " + number + "\n");
		
		numberAsString += 1;	//this just adds '1' to the end of 2018 resulting with: 2018.1251
		number += 1;			//this adds '1' to 2018 resulting with: 2019.125
		
		System.out.println("numberAsString = " + numberAsString + "\n" + "number = " + number);

	}//end main

}//end class
