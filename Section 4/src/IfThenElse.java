//	03.17.2021

public class IfThenElse {

	public static void main(String[] args) {

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		/*
		if(score < 5000 && score > 1000) {
			System.out.println("Your score was less than 5000 but greater than 1000");
		}//end if
		else if (score < 1000) {
			System.out.println("Your score was less than 1000");
		}//end else if
		else {
			System.out.println("You score was 5000");
		}//end else
		*/
		
		if(gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}//end if
		
		//int saved FinalScore = finalScore; (here you can't use 'finalScore' as it's not a global variable and only accessible within the above if statement
		
		//CHALLENGE
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		if(gameOver == true) {
			int secondFinalScore = score + (levelCompleted * bonus);
			System.out.println("Your second final score was " + secondFinalScore);
		}//end if
		//Challenge successfully completed on our own

	}//end main

}//end class
