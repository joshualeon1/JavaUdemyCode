//	03.25.2021

public class MethodOverloading {

	public static void main(String[] args) {

		/* Method Overloading is when you use a method with the SAME name twice, as shown below for 'calculateScore'.
		 * The difference is that, in order to do this, you must change the parameters the method takes, if you change the name rather than the parameter,
		 * this is no longer 'Method Overloading'. In order to use the second method, you must write the code as on line 14.
		 */

		int newScore = calculateScore("Tim", 500);
		System.out.println("New score is " + newScore);
		calculateScore(75);
		calculateScore();
		
		//Challenge output below
		calcFeetAndInchesToCentimeters(1, 2);
		calcFeetAndInchesToCentimeters(100);

	}//end main

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}//end calculateScore

	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}//end calculateScore

	public static int calculateScore() {
		System.out.println("No player name, no player score.");
		return 0;
	}//end calculateScore

	/*
	public static void calculateScore() {
		System.out.println("No player name, no player score.");	<----Does not count as 'Method Overloading' with method type changed ( changed from int -> void )
	}//end calculateScore
	 */

	//CHALLENGE BELOW
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if((feet <0) || ((inches <0) || (inches >12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }//end method

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if(inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }//end method

}//end class
