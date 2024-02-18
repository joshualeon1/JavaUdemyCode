//	03/10/2021

public class FloatAndDouble {

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
		int myIntValue = 5;
		
		// if you set equal to 5.25 it won't work, but if you set it to just 5 w/o f it will work
		float myFloatValue = (float)5;/*we did the challenge here by adding (float) in front of the number,
		it is recommended to just add the f at the end of the number rather than write the whole thing*/
		
		//if you set equal to 5.25 with or w.o the d it will work
		double myDoubleValue = 5d;
	
	}

}
