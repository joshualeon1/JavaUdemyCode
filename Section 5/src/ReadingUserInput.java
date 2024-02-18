//	04.07.2021

import java.util.Scanner;

public class ReadingUserInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);			//creating our scanner to read user input

		System.out.println("Enter your Year of Birth: ");

		boolean hasNextInt = scan.hasNextInt();			//a variable to check if input given is an Integer variable

		if(hasNextInt) {
			int yearOfBirth = scan.nextInt();			//takes input from user and inputs value into Integer variable 'yearOfBirth'
			scan.nextLine();							//handle next line character (enter key) (without this, the enter your name prompt is skipped)

			System.out.println("Enter your name: ");
			String name = scan.nextLine();				//takes input from user and inputs value into String variable 'name'
			int age = 2021 - yearOfBirth;

			if(age >= 0 && age <= 100) {
				System.out.println("Your name is " + name + ", and you are " + age + " years old.");	//outputs
			} else {
				System.out.println("Invalid Year of Birth");
			}//end if-else
		} else {
			System.out.println("Unable to parse year of birth.");
		}

		scan.close();									//closes the scanner (to not use anymore)

	}//end main

}//end class
