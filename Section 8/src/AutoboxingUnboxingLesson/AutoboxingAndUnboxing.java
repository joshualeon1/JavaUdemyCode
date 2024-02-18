package AutoboxingUnboxingLesson;
//	06.17.2021

import java.util.ArrayList;

class IntClass {
	private int myValue;

	public IntClass(int myValue) {
		this.myValue = myValue;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}
}

public class AutoboxingAndUnboxing {

	public static void main(String[] args) {
		String[] strArray = new String[10];
		int[] intArray = new int[10];

		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("Tim");

		//ArrayList<int> intArrayList = new ArrayList<int>();
		ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
		intClassArrayList.add(new IntClass(54));
		Integer integer = new Integer(54);
		Double doubleValue = new Double(12.25);

		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		/*for(int i=0; i<=10; i++) {
            intArrayList.add(Integer.valueOf(i));	<--- This part within the '.add' is 'Autoboxing'
          }

        for(int i=0; i<=10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());	<--- This part here 'intArrayList.get(i).intValue()' is 'Unboxing'
        }*/

		Integer myIntValue = 56; //	<---This is valid, because at 'compile time' meaning at the time the program is run, Java kindly runs this code for you ---> Integer.valueOf(56);
		int myInt = myIntValue; // <-- This is also valid for the same reason, at 'compile time' this is run ---> myIntValue.intValue();

		ArrayList<Double> myDoubleValues = new ArrayList<Double>();
		for(double dbl=0.0; dbl<=10.0; dbl += 0.5) {
			myDoubleValues.add(dbl);
		}

		for(int i=0; i<myDoubleValues.size(); i++) {
			double value = myDoubleValues.get(i);
			System.out.println(i + "  --> " + value);
		}

	}//end main

}//end class
