package ArraysLesson;

//	06.14.2021

import java.util.Scanner;

public class ArraysChallenge {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numOfInts = 0;
		
		while(true) {
			System.out.println("Enter the number of integers you want to sort: ");
			if(scan.hasNextInt()) {
				numOfInts = scan.nextInt();
				break;
			} else {
				System.out.println("Invalid value. Please try again.");
				scan.nextLine();
			}
		}
		
		
		int[] myIntegers = getIntegers(numOfInts);
		System.out.println("-------------------------------------------------\nUn-sorted:");
		printArray(myIntegers);
		System.out.println("-------------------------------------------------\nSorted:");
		printArray(sortIntegers(myIntegers));

	}//end main
	
	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " integer values.\r");
		int[] values = new int[number];
		
		for(int i = 0; i < values.length; i++)
			values[i] = scan.nextInt();
		
		return values;
	}
	
	public static void printArray(int[] array) {
		for(int i=0; i < array.length; i++)
			System.out.println("Element: " + i + "'s value is = " + array[i]);
	}
	
	public static int[] sortIntegers(int[] array) {
		for (int i = 0; i < array.length; i++) {
	        for (int j = i + 1; j < array.length; j++) {
	            int temp = 0;
	            if (array[i] < array[j]) {
	                temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }
	    }
		return array;
	}

}//end class
