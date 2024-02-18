package ArraysLesson;
//06.14.2027

import java.util.Scanner;
import java.util.Arrays;

public class MinElementChallenge {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		while(true) {
			System.out.println("Enter the number of integers: ");
			if(scan.hasNextInt()) {
				System.out.println("Minimum value in array: " + findMin(readIntegers(scan.nextInt())));
				break;
			} else {
				System.out.println("Invalid value. Please try again.");
				scan.nextLine();
			}
		}
		
		scan.close();

	}//end main
	
	public static int[] readIntegers(int count) {
		int[] myIntArray = new int[count];
		System.out.println("Enter " + count + " numbers:");
		for(int i = 0; i < myIntArray.length; i++) {
			myIntArray[i] = scan.nextInt();
		}
		return myIntArray;
	}
	
	public static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++) {
			if(min > array[i])
				min = array[i];
		}
		return min;
	}

}//end class
