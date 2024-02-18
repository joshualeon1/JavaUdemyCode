package com.example.scope;

import java.util.Scanner;

public class ScopeChallenge {
	
	public static void main(String[] args) {

		System.out.println("Enter a number whose times table you wish to have print out: ");
		X x = new X(new Scanner(System.in));//This is another way that we could use the Scanner
		System.out.println("============================");
		x.x();

	}
	

}//end ScopeChallenge class

class X {
	
	private int x;
	
	public X(Scanner x) {//We can pass a Scanner type in
		this.x = x.nextInt();
	}
	
	public void x() {
		for(int x = 1; x < 13; x++)
			System.out.println(x + " times " + this.x + " equals: " + this.x*x);
	}
	
}//end X class
