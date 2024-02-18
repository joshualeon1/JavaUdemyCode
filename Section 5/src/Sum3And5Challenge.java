//	03.31.2021
//Challenge Done Successfully

public class Sum3And5Challenge {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("Number found: " + i);
				sum += i;
				count++;
			}//end if-statement
			
			if(count == 5) {
				System.out.println("Sum: " + sum);
				break;
			}//end if-statement
			
		}//end for-loop

	}//end main

}//end class
