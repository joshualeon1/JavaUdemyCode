//	03/07/2021

public class PrimitiveTypesChallenge {

	public static void main(String[] args) {

		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;
		long longValue = (long)(50000 + (10*(byteValue + shortValue + intValue)));
		/*in the example, it's coded like this without casting:
		 * long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
		 */
		System.out.println("The long value is:\n" + longValue);
		

	}//end main

}//end class
