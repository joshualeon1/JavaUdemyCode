//	03.16.2021

public abstract class KeywordsAndExpressions {

	public static void main(String[] args) {

		// a mile is equal to 1.609344 kilometers
		double kilometeres = (100 * 1.609344);
		int highScore = 50;
		
		if(highScore == 50) {
			System.out.println("This is an experession");
		}//end if
		
		//CHALLENGE
		//In the following code, write down what parts of the code are expressions.
		int score = 100;									// 'score = 100' is the expression
		if (score > 99) {									// 'score > 99' is the expression
			System.out.println("You got the high score!");	// "You got the high score!" is the expression
			score = 0;										// 'score = 0' is the expressions
		}//end if
		
	}//end main

}//end class
