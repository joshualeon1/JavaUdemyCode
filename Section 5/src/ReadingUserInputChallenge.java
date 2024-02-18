//	04.08.2021
//	NOTE: Challenge was completed successfully on our own.

import java.util.Scanner;

public class ReadingUserInputChallenge {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);						//creating scanner object 'scan'

		int counter = 1;											//counter variable to track that we're executing 10 times
		int sum = 0;												//sum variable where the value of every input is added to a sum

		while(counter != 11) {										//while counter is != to 11 (as to execute 10 times)
			System.out.println("Enter number #" + counter + ":");	//This line is output with the value of counter starting at 1 ending with 10
			boolean hasAnInt = scan.hasNextInt();					//variable as to check whether we were given a valid Integer value or not
			if(hasAnInt) {											//executes only if variable 'hasAnInt' is true
				sum += scan.nextInt();								//if true, sum += value of given valid Integer
				counter++;											//we add 1 to the counter
				if(counter == 11) {									//here we check if counter is greater than 10 meaning this has already executed 10 times
					break;											//if true, we break from the loop
				}
			} else {												//if the given value isn't an Integer, rather, false,
				System.out.println("Invalid Value");				//'Invalid Value' is output
			}//end if-else
			
			scan.nextLine();										//handles end of line (enter key)
			
		}//end while
		
		System.out.println("Sum of Numbers: " + sum);		//if true, this line is output with the final sum of all 10 given valid Integers
		scan.close();

	}//end main

}//end class
