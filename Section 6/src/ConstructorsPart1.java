//	4.15.2021

public class ConstructorsPart1 {

	public static void main(String[] args) {

		//Creating the variable 'bobsAccount' of type 'bankAccount' using the previous class we made and setting the values within the parenthesis.
		bankAccount bobsAccount = new bankAccount("1234567", 0.0, "Bob Brown", "bobBrown@gmail.com", "1-209-468-7539");
		
		System.out.println(bobsAccount.getPhoneNumber() + " \n" + bobsAccount.getBalance());
		
		bobsAccount.withdrawal(100.0);
		
		bobsAccount.deposit(50.0);
		bobsAccount.withdrawal(100.0);
		
		bobsAccount.deposit(51.0);
		bobsAccount.withdrawal(100.0);
		
		//testing code from Constructors Part 2 video below:
		VipCustomer person1 = new VipCustomer();
		System.out.println("\n" + person1.getName());
		
		VipCustomer person2 = new VipCustomer("Bob", 25000.00);
		System.out.println(person2.getName());
		
		VipCustomer person3 = new VipCustomer("Tim", 100.00, "Tim@gmail.com");
		System.out.println(person3.getName() + "\n" + person3.getEmailAddress());

	}//end main

}//end class
