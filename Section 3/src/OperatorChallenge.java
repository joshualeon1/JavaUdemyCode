//	03/15/2021

public class OperatorChallenge {

	public static void main(String[] args) {

		double myFirstDouble = 20.00;
		double mySecondDouble = 80.00;
		double doubleValueTotal = (myFirstDouble + mySecondDouble) * 100.00;
		double myRemainder = doubleValueTotal % 40.00;
		
		boolean myBoolean = (myRemainder == 0) ? true : false;
		System.out.println(myBoolean);
		
		if (!myBoolean) { //recall that !myBoolean is the same as checking if it is NOT true, meaning false
			System.out.println("Got some remainder");
		}//end if

	}//end main

}//end class
