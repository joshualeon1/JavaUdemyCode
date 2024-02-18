//	03.16.2021

public class StatementsWhitespaceIdentation {

	public static void main(String[] args) {

		int myVariable = 50;					// 'int myVariable = 50;' is a whole statement
		myVariable++;							// 'myVariable++' is a whole statement
		myVariable--;							// 'myVariable--' is a whole statement
		System.out.println("This is a test");	//this whole line is a statement
		
		System.out.println("This is" + " another" + " still more.");	//still a valid statement
		
		int anotherVariable = 50; myVariable--; // You could put more than 1 statement in the same line, but not recommended. Yet is valid.
		
		double       myDouble = 50.00;			//even with all the Whitespace, it will be ignored and only search/use the valid code.
		
		//Indentation
		/* As we see above between line 5 and line 7, there is an indentation. Indentation is used to make code more readable, and see
		 * a proper flow of the code. You can do CTRL + A then CTRL + I
		 */
		
	}//end main

}//end class
