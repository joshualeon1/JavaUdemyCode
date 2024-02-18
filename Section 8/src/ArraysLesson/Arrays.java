package ArraysLesson;
//	06.13.2021

import java.util.Scanner;

public class Arrays {
	
	//the scanner is 'private' so that it is only accessed in this class, as well it is 'static' so that the scanner can be used anywhere within this class file
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		//Instantiating a variable that holds a 'single' value
		int myIntVariable = 50;

		//Instantiating a variable that may hold 'multiple' values, in this case, 10 elements.
		int[] myIntArray = new int[10];

		//Assigning the value at index '5' to 50 (index starts at 0 and ends at 9)
		myIntArray[5] = 50;

		//How to output the value at a specific index within an array
		System.out.println(myIntArray[5]);

		//Instantiating more values into the 'myIntArray' integer array (but this way is tedious)
		myIntArray[0] = 45;
		myIntArray[1] = 476;

		//So you could instantiate multiple values ONLY in the beginning as so:
		int[] myNewIntArray = {1,2,3,4,5,6,7,8,9,10};//New 'int' data type array of size 10, meaning it has 10 elements (1-10)
		
		//Printing out the values at different indexes from the previous array:
		System.out.println(myNewIntArray[0] + "\n" + myNewIntArray[6] + "\n" + myNewIntArray[8]);

		//An array of type 'double'
		double[] myDoubleArray = new double[10];
		
		//Instantiating value within an array using a 'for loop'
		int[] myArray = new int[10];
		for(int i = 0; i < 10; i++)
			myArray[i] = i*10;
		
		//Printing out the new values we just instantiated in the previous array:
		for(int i = 0; i < myArray.length; i++)//Note: we use 'myArray.length' instead of 10 as it's the same thing. The SIZE of our array is '10' as we stated on line 33.
			System.out.println("Element: " + i + "'s value is = " + myArray[i]);
		
		//Using the method outside 'main' to print the same array:
		System.out.println("-------------------------------------------------");//Splitting simply to make it easier to see
		printArray(myArray);
		
		//This part if from our 'Arrays' video starting at time 14:30
		int[] myIntegers = getIntegers(5);
		System.out.println("-------------------------------------------------");//Splitting simply to make it easier to see
		printArray(myIntegers);
		
		//Printing the average of a given array:
		System.out.println("-------------------------------------------------\nThe average is: " + getAverage(myIntegers));//Splitting simply to make it easier to see
		
		/* You can reinitialize an array by doing the following:
		 * int[] anArray = new int[5];	<--- Here, we ONLY set the size to 5, and since we used the 'new' keyword, the values in range 0 to 4 are all zeros.
		 * anArray = new int[] {1, 2, 3, 4, 5};	<--- Here, we reinitialize AND set the values in range 0 to 4 to the values we see in the curly brackets. Also, this basically recreates in array in a different memory address.
		 */
		
		/* How to RESIZE an array: (meaning, if your array started with a size 10, you could resize it to 12 and still keep whatever data you have in it, intact)
		 * int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};	<--- An array of size 10
		 * int[] copy = array;	<--- We make another array to hold our data of the same size
		 * array = new int[12];	<--- We reset our initial array to size 12, since we used 'new' all 12 elements hold value 0
		 * for(int i = 0; i < copy.length; i++)
		 * 	   array[i] = copy[i];	<---	Here, we simply throw back in the same data into its place, but now with a size of 12
		 */
		
		
	}//end main
	
	//A method for printing any array of data type 'int'
	public static void printArray(int[] array) {
		for(int i=0; i < array.length; i++)
			System.out.println("Element: " + i + "'s value is = " + array[i]);
	}
	
	//Here we created a method of an 'integer array' type, so an array is expected as a return
	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " integer values.\r");//The '\r' simple moves us to the next line. Kind of like '\n'. Run the program and see for yourself.
		int[] values = new int[number];
		
		for(int i = 0; i < values.length; i++)
			values[i] = scan.nextInt();
		return values;
	}
	
	//A method returning the average within a given array:
	public static double getAverage(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++)
			sum += array[i];//adding it all up
		return (double)sum / (double)array.length;//Returns the average here.
	}

}//end class
