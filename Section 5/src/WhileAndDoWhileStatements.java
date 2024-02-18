//	04.01.2021

public class WhileAndDoWhileStatements {

	public static void main(String[] args) {

		//		int count = 1;
		//		while(count != 6) {
		//			System.out.println("Count value is " + count);
		//			count++;
		//		}//end while

		//		//for-loop version of what we did above
		//		for(count = 1; count != 6; count++) {
		//			System.out.println("Count value is " + count);
		//		}//end for

		//could also do below
		//		count = 1;
		//		while(true) {
		//			if(count == 6) {
		//				break;
		//			}//end if
		//			System.out.println("Count value is " + count);
		//			count++;
		//		}//end while

		//do-while statement example below
		//		count = 1;
		//		do {
		//		System.out.println("Count value is " + count);
		//		count++;

		//		if(count > 100) {
		//			break;
		//		}//end if

		//		} while (count != 6);

		//some code using the challenge code  method below:
		int number = 4;
		int finishedNumber = 20;

//		while(number <= finishedNumber) {
//			number++;
//			if(!isEvenNumber(number)) {		//if number returns false in method with '!' meaning true, (not an even number) continue until number is even
//				continue;					//continue until number is even essentially the translation
//			}//end if
//			System.out.println("Even number " + number);
//		}//end while

		//Challenge Code Below Modifying While-Statement Above:
		int evenNumbersFound = 0;
		number = 4;

		while(number <= finishedNumber) {
			number++;
			if(!isEvenNumber(number)) {
				continue;
			}//end if
			System.out.println("Even number: " + number);
			evenNumbersFound++;
			if(evenNumbersFound == 5) {
				System.out.println("Total Number of Even Numbers: " + evenNumbersFound);
				break;
			}//end if
		}//end while

	}//end main

	//Challenge code below:
	public static boolean isEvenNumber(int number) {
		if((number <= 0) || (number % 2 != 0)) {
			return false;
		}
		return true;
	}//end isEvenNumber

}//end class
