//	03/11/2021

public class PrimitiveTypeRecapAndStringDataType {

	public static void main(String[] args) {
		
		//listed from least used to most used:
		//byte
		//short
		//long
		//float
		//char
		//int
		//double
		//boolean
		
		//String examples
		String myString = "This is a string";
		System.out.println("myString is equal to " + myString);
		
		//adding to the string
		myString = myString + ", and this is more.";
		System.out.println("myString is equal to " + myString);
		
		//you can use Unicode with string
		myString = myString + " \u00A9 2021";
		System.out.println("myString is equal to " + myString);
		
		//using numbers within a String
		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println(numberString);//as we see in this output, they're just next to each other and didn't add
		
		//an example using two different data types: String and Int
		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;//what happens here is that the program converts '50' to a string and adds it to the string
		System.out.println("LastString is equal to " + lastString);//here we get the outcome of the above
		
		//another eexample using doubles
		double doubleNumber = 120.47d;
		lastString = lastString + doubleNumber;
		System.out.println("LastString is equal to " + lastString);//we see the same thing happen as with the Int here
		
		
			

	}//end main

}//end class
