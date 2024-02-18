//	08.06.2021
//	Interfaces Notes Here

package InterfacesLesson;

interface IColor {
	
	//My own addition to the program, basically, just adding a variable in order to show that variable instantiated within this 'Interface' can be used in the main class that implements this interface
	String color = "blue";
	
}
public class InterfacesMainClass implements IColor {

	public static void main(String[] args) {

		//	ITelephone joshuasPhone = new DeskPhone(123456); <--- This is invalid
		//	Note that one COULD do 'DeskPhone joshuasPhone = new DeskPhone(123456);' instead but that would make an ONLY 'DeskPhone' object, not a "global" object that can by used by other class objects,
		//	for example, the other 'MobilePhone' class object
		ITelephone joshuasPhone;
		joshuasPhone = new DeskPhone(123456);
		joshuasPhone.powerOn();
		joshuasPhone.callPhone(123456);
		joshuasPhone.answer();
		
		joshuasPhone = new MobilePhone(234567);
		joshuasPhone.powerOn();
		joshuasPhone.callPhone(234567);
		joshuasPhone.answer();
		
		/*	
		 * 	Note: I did some testing, and it seems that, methods you implement in a class that aren't forced to be implemented by the 'Interface' CANNOT be accessed using the '.' operator when the variable is instantiated
		 *	as a 'ITelephone' or in other words, of 'Interface' type.
		 *	joshuasPhone.doesNothing(); <-- You can't even find the 'doesNothing()' method when using the '.' operator
		 *	Has to be casted as a 'MobilePhone' object in order to have access to the 'doesNothing' method
		 */
		((MobilePhone) joshuasPhone).doesNothing();
		
		//	As one can see, even instantiated variables from the 'interface' can be accessed here
		System.out.println(color);

	}//end main

}//end class
