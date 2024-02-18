//	04.09.2021

import java.util.Scanner;

public class MinAndMaxInputChallenge {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);								//creating our scanner

		//creating the variables we need
		int max = 0;
		int min = 0;
		boolean first = true;												//this variable is to handle the first user input, as to set the min and max to that first given value

		while(true) {

			System.out.println("Enter Number:");							//This is output to the user from start and repeatedly until user inputs invalid value
			boolean isAnInt = scan.hasNextInt();							//variable to check if we're given a valid int value

			if(isAnInt) {													//if value is valid, this executes
				
				int number = scan.nextInt();								//given value is set to variable 'number'
				
				if(first) {													//this a flag used to store the first given value into the variables 'min' and 'max'
					first = false;											//we turn this "off" as we only need to do this once
					min = number;											//min is set to the first value
					max = number;											//max is set to the first value
				}//end if
				
				if(number > max) {											//we check if 'number' is greater than max
					max = number;											//if so, 'number' is now the new max
				} else if(number < min) {									//we check if 'number' is less than min
					min = number;											//if so, 'number' is now the new min
				}//end if-else

			} else {														//if 'isAnInt' is false, meaning an invalid value was given
				break;														//we break from the loop
			}//end if-else

			scan.nextLine();												//handles input

		}//end while
		
		System.out.println("Min Number: " + min + "\nMax Number: " + max);	//we print the values to user
		scan.close();														//scanner is closed as we no longer need to use it

	}//end main

}//end class
