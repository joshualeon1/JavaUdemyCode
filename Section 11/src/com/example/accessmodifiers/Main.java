package com.example.accessmodifiers;

public class Main {

	public static void main(String[] args) {

		Account JoshuasAccount = new Account("Joshua");
		
		JoshuasAccount.deposit(1000);
		JoshuasAccount.withdraw(500);
		JoshuasAccount.withdraw(-200);
		JoshuasAccount.deposit(-20);
		JoshuasAccount.calculateBalance();
//		JoshuasAccount.balance = 5000;
		
		System.out.println("Balance on account is " + JoshuasAccount.getBalance());

	}//end Main
	
}//end Class
