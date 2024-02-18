//	03/14/2021

public class AssignmentOperatorVsEqualsToOperator {

	public static void main(String[] args) {

		int newValue = 50;

		if (newValue == 50) {	//you need '==' to compare the check if it is equal to 50, '=' assigns the value 50, does not check
			System.out.println("This is true");
		}//end if

		boolean isCar = false;
		if (!isCar) {  //still outputs if set equal to true because it's a boolean type and takes either, so be sure to use proper '==' vs '='
			System.out.println("This is not supposed to happen");//	!isCar is the same as: isCar != true (is 'isCar' not equal to true, meaning false)
		}//end if

	}//end main

}//end class
