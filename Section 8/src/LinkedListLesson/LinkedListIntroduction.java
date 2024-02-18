package LinkedListLesson;
//	07.21.2021
//	Basically, just goes shows examples of other things BESIDES a linkedList, to then in 'LinkedListDemo' class show the advantages of a linkedList

import java.util.ArrayList;

class Customer2{
	
	private String name;
	private double balance;
	
	public Customer2(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

public class LinkedListIntroduction {

	public static void main(String[] args) {

		Customer2 customer = new Customer2("Joshua", 54.96);	//<--- INITIALLY we set the parameter 'balance' to '54.96'
		Customer2 anotherCustomer;								//<--- Create our SECOND 'Cusomter2' object
		anotherCustomer = customer;								//<--- Here, 'anotherCustomer' points to the SAME MEMORY LOCATION as the first 'Customer2' object, 'customer' whose balance was initially '54.96'
		anotherCustomer.setBalance(12.18);						//<--- BUT, then it gets changed here using the setter method with 'anotherCustomer' since they both point to the same memory location, changes for both
		System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());//<--- Which is why HERE the balance ultimately prints '12.18'
		System.out.println("==============================================");
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(3);
		intList.add(4);
		
		for(int i=0; i<intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}
		
		System.out.println();
		
		intList.add(1, 2);//inserts the value '2' at index '1' while moving the rest of the values one more index up (NOTE: the value '3' at index 1 does not get replaced, simply moved up)
		
		for(int i=0; i<intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}

	}//end main

}//end class
