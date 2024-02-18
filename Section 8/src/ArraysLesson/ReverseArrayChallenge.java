package ArraysLesson;
//	06.15.2021

import java.util.Arrays;

public class ReverseArrayChallenge {

	public static void main(String[] args) {

		int[] array = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(array));
		reverse(array);

	}//end main
	
	public static void reverse(int[] array) {
		int[] reversedArray = new int[array.length];
		int count = array.length-1;
		for(int i = 0; i < array.length; i++) {
			reversedArray[i] = array[count];
			count--;
		}
	}

}//end class
