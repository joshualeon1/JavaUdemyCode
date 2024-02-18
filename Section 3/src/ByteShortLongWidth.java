//	03/07/2021

public class ByteShortLongWidth {

	public static void main(String[] args) {
		
		//lines 8-16 were from a previous lesson displaying the max/min num we can output with an int
		int myValue = 10000;
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Integer Maximum Value = " + myMaxIntValue);
		//the lines below displays what occurs when going out of bounds of the min/max
		System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
		System.out.println("Busted MIN Value = " + (myMinIntValue - 1) + "\n");
		
		
		//lines 20-23 display the max/min num we can output with a byte
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimum Value = " + myMinByteValue);
		System.out.println("Byte Maximum Value = " + myMaxByteValue + "\n");
		
		//lines 26-29 display the max/min num we can output with a short
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Minimum Value = " + myMinShortValue);
		System.out.println("Short Maximum Value = " + myMaxShortValue + "\n");
		
		//lines 36-39 display the max/min num we can output with a short
		
		//this is how you declare a long, you insert an l at the end of the num
		long myLongValue = 100L;
	
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Minimum Value = " + myMinLongValue);
		System.out.println("Long Maximum Value = " + myMaxLongValue);

	}//end main

}//end class
