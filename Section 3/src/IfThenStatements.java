//	03/13/2021

public class IfThenStatements {

	public static void main(String[] args) {

		boolean isAlien = false;
		if (isAlien == false)	{	//you don't add a semicolon here, if you have more than 1 line under the if-statement, add a '{' to create a code block
			System.out.println("It is not an alien!");
			System.out.println("And I am scared of aliens.");//if you change the false to true in line 8, it will still output line 10
		}//end if-statement

	}//end main

}//end class
