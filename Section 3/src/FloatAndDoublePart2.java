//	03/10/2021

import java.util.Scanner;//this a Java API that creates Scanner objects
import java.io.*;//this is a Java API that allows for targeted reading/writing of data (input/output) hence the io

public class FloatAndDoublePart2 {

	public static void main(String[] args) {

		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("My MIN Float Value: " + myMinFloatValue);
		System.out.println("My MAX Float Value: " + myMaxFloatValue + "\n");

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("My MIN Double Value: " + myMinDoubleValue);
		System.out.println("My MAX Double Value: " + myMaxDoubleValue + "\n");

		//the three lines of code below display how you can declare these variables as such and will work
		int myIntValue = 5 / 2;
		
		// if you set equal to 5.25 it won't work, but if you set it to just 5 w/o f it will work
		float myFloatValue = 5f / 2f;/*we did the challenge here by adding (float) in front of the number,
		it is recommended to just add the f at the end of the number rather than write the whole thing*/
		
		//if you set equal to 5.25 with or w.o the d it will work
		double myDoubleValue = 5d / 2d;
		
		System.out.println("MyIntValue: " + myIntValue);//what we see here is, since this is an int, rather than output 2.5 it rounds down to 2
		System.out.println("MyFloatValue: " + myFloatValue);
		System.out.println("MyDoubleValue: " + myDoubleValue + "\n");
		
		int mySecondIntValue = 5 / 3;
		float mySecondFloatValue = 5f / 3f;
		double mySecondDoubleValue = 5d / 3d;//you can also remove the d and just do 5.00 / 3.00
		
		System.out.println("MySecondIntValue: " + mySecondIntValue);//what we see here is, 3 goes into 5 once so it outputs 1 with no remainder
		System.out.println("MySecondFloatValue: " + mySecondFloatValue);//float goes 7 decimal points after 
		System.out.println("MySecondDoubleValue: " + mySecondDoubleValue);//double goes more than the float so a more precise answer
		
		//Challenge below:
		double pounds;
		double kilograms;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of pounds to convert to kilograms: ");
		pounds = scan.nextDouble();
		kilograms = pounds * 0.45359237;
		System.out.println("Resulted Kilograms: " + kilograms);
		
		//OVERALL TAKE: just use doubles as they are better, run faster, and certain things only use doubles



	}

}
