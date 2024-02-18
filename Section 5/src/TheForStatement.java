//	03.30.2021

public class TheForStatement {

	public static void main(String[] args) {
		
		System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0) + "\n");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Loop " + i + " hello!");
		}//end for-loop
		
		System.out.println("");
		
		//Challenge Below: (NOTE: Challenge done successfully on our own)
		for (int i = 2; i < 9; i++) {
			//the 'String.format("%.1f", insert what needs to be formatted here); converts the num to a String and cuts off after 1 decimal point
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.1f",calculateInterest(10000.0, i)));
		}//end for-loop
		
		System.out.println("");
		
		//Another Challenge: (NOTE: Challenge done successfully on our own)
		for (int i = 8; i > 1; i--) {
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.1f",calculateInterest(10000.0, i)));
		}//end for-loop
		
		System.out.println("");
		
		//Challenge Using 'isPrime' method below:
		int count = 0;
		for (int i = 10; i < 50; i++) {
			
			if(isPrime(i)) {		//you don't need '(isPrime(i) == true)' just '(isPrime(i))' is fine and works
				count++;
				System.out.println(i + " is a prime number.");
			} else if(count == 3) {
				break;
			}//end if-elseif-statement
	
		}//end for-loop

	}//end main
	
	public static boolean isPrime(int n) {
		
		if(n == 1) {
			return false;
		}//end if-statement
		
		for(int i = 2; i <= (long) Math.sqrt(n); i ++) {		//the '(long) Math.sqrt(n)' makes the search more optimized
			if (n % i == 0) {
				return false;
			}//end if-statement
			
		}//end for-loop
		
		return true;
		
	}//end isPrime
	
	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate/100));
	}//end calculateInterest

}//end class
