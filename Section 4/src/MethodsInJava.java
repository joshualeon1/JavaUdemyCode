//	03.18.2021 - 03.19.2021

public class MethodsInJava {

	public static void main(String[] args) {

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);//you can also throw it into a variable like here
		System.out.println("Your final score was " + highScore);

		calculateScore(gameOver, score, levelCompleted, bonus);//you can pass in the variables you're using in this method

		calculateScore(true, 10000, 8, 200);//you can also just insert the direct value of the variables

		//Challenge completed successfully below
		int position = calculateHighScorePosition(1500);
		displayHighScorePosition("John", position);

		position = calculateHighScorePosition(900);
		displayHighScorePosition("Tim", position);

		position = calculateHighScorePosition(400);
		displayHighScorePosition("Bob", position);

		position = calculateHighScorePosition(50);
		displayHighScorePosition("Joe", position);

	}//end main

	//Creating our own method
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { //within the parenthesis you pass the variables you want to use

		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}//end if

		return -1;//-1 means an invalid value or value not found generally by the way

		//NOTE: we have 'void' as aren't sending any value back, just executing, if we did want to return a value, we could change 'void' to 'int' then within the
		//method we create a variable, set it equal we want to return and type 'return insertVariableHere;'

	}//end calculateScore

	public static void displayHighScorePosition(String playerName, int position) {

		System.out.println(playerName + " managed to get into position " + position + " on the high score table.");

	}//end displayHighScorePosition

	public static int calculateHighScorePosition(int score) {

		if(score >= 1000) {
			return 1;
		}//end if
		else if(score >= 500) {
			return 2;
		}//end else if
		else if(score >= 100) {
			return 3;
		}
		return 4;

	}//end calculateHighScorePosition

}//end class
