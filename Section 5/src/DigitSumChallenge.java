//	04.02.2021
//	Challenge completed successfully

public class DigitSumChallenge {

	public static void main(String[] args) {

		System.out.println(sumDigits(125));

	}//end main

	public static int sumDigits(int number) {

		//we return -1 for any number 0-9 and non-positive integers
		if(number < 10) {
			return -1;
		}//end if

		//creating our sum variable
		int sum = 0;

		while (number > 0) {
			int temp = number % 10;				//125 becomes 5 and stored in num1
			sum += temp;					//add num1 value into sum
			number /= 10;					//number becomes 12 and stored back into itself
			
		}//end while

		return sum;

	}//end sumDigits

}//end class
