//	03/14/2021

public class TernaryOperator {

	public static void main(String[] args) {
	
		boolean isCar = false;	// 'isCar' assigned false
		
		isCar = true;	// 'isCar' reassigned to true
		boolean wasCar = isCar ? true : false;//Here, 'wasCar' is assigned the value of whatever 'isCar' is, so if it's true, set to true, otherwise, false
		if (wasCar) {
			System.out.println("wasCar is True");
		}//end if

	}//end main

}//end class
