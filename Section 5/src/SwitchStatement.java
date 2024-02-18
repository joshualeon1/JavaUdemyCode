//	03.28.2021

public class SwitchStatement {

	public static void main(String[] args) {


		/*	Below is example of a non-switch statement method of doing something
		int value = 3;
		if(value == 1) {
			System.out.println("Value was 1");
		} else if(value == 2) {
			System.out.println("Value was 2");
		} else {
			System.out.println("Value was not 1 or 2");
		}//end if-else
		 */

		//	Below is example of switch-statement method of doing the above
		/*	Note: If the value given to switch statement is 2, it will output case 2, but if you change case 2 output to value was 3 even though the int value
			is 2, it will still print case 2 and say value was 3 even if false, meaning the value correlates to the case, and doesn't check if true or false like
			an if statement
		 */

		//Using switch-statement below
		/*
		int switchValue = 3;

		switch(switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;												//break is always needed for each case

		case 2:
			System.out.println("Value was 2");
			break;

		case 3: case 4: case 5:
			System.out.println("was a 3, or a 4, or a 5");
			System.out.println("Actually it was a " + switchValue);
			break;

		default:												//default here is like 'else' which handles all other possibilities
			System.out.println("Value was not 1 or 2");
			break;

		}//end switch statement
		 */

		//Switch-statement Challenge
		char myCharValue = 'A';

		switch(myCharValue) {
		case 'A':case 'B':case 'C':case 'D':case 'E':
			System.out.println(myCharValue + " was found");
			break;
		default:
			System.out.println("Could not find A, B, C, D, or E");
			break;

		}//end switch-statement
		
		//A switch-statement with variable of type String below
		
		String month = "JANUARy";
		
		switch(month.toLowerCase()) {		//the class .toLowerCase() converts the whole string to lower case, likewise .toUpperCase() does the opposite
		case "january":
			System.out.println("Jan");
			break;
		case "may":
			System.out.println("May");
			break;
		default:
			System.out.println("Month not found");
			break;
		}//end switch-statement

	}//end main

}//end class
