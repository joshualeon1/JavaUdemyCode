//	03/13/2021

public class LogicalOROperator {

	public static void main(String[] args) {

		int topScore = 80;
		int secondTopScore = 81;

		if((topScore > 90) || (secondTopScore <= 90)) {	// for the 'OR' operator only one of the two checks needs to be true to execute the following code
			System.out.println("Either or both of the conditions is true.");
		}//end if

	}//end main

}//end class
