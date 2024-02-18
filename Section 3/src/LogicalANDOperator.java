//	03/13/2021

public class LogicalANDOperator {

	public static void main(String[] args) {

		int topScore = 80;
		if(topScore != 100) {	//the != means "not equal" you can also use: >, <, >=, <=, etc.
			System.out.println("You got the high score!");
		}//end if
		
		int secondTopScore = 60;
		if (topScore > secondTopScore && topScore < 100) {	//here it does to checks and since it's 'AND' both must be true to output
			System.out.println("Greater than second top score and less than 100");
		}//end if

	}//end main

}//end class
