package ArraysLesson;
//	06.14.2021

import java.util.Arrays;

public class ReferencesTypesVsValueTypes {

	public static void main(String[] args) {

		int myIntValue = 10;//value type
		int anotherIntValue = myIntValue;//reference type
		
		System.out.println("myIntValue = " + myIntValue + "\nanotherIntValue = " + anotherIntValue);
		
		anotherIntValue++;
		System.out.println("myIntValue = " + myIntValue + "\nanotherIntValue = " + anotherIntValue);
		
		int[] myIntArray = new int[5];
		int[] anotherArray = myIntArray;
		
		System.out.println("myIntArray = " + Arrays.toString(myIntArray) + "\nanotherArray = " + Arrays.toString(anotherArray));
		
		anotherArray[0] = 1;
		
		System.out.println("after change myIntArray = " + Arrays.toString(myIntArray) + "\nafter change anotherArray = " + Arrays.toString(anotherArray));
		
		//NOTE: Even though it would same that ONLY the array 'anotherArray' would change, since they BOTH point to the SAME memory location, it is changed for both of them.
		
		anotherArray = new int[] {4, 5, 6, 7, 8};
		modifyArray(myIntArray);
		
		System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray) + "\nafter modify anotherArray = " + Arrays.toString(anotherArray));

	}//end main
	
	private static void modifyArray(int[] array) {
		array[0] = 2;
		array = new int[] {1, 2, 3, 4, 5};//reinitializing the array
	}

}//end class
