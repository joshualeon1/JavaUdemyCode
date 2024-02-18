package com.example.udemyfinal;

public class SIBTest {

	public static final String owner;
	
	static {
		owner = "tim";
		System.out.println("SIBTest static initialization block called.");
	}
	
	public SIBTest() {
		System.out.println("SIB constructor called.");
	}
	
	static {
		System.out.println("Second initialization block called.");
	}
	
	public void someMethod() {
		System.out.println("someMethod() called.");
	}
	
}//Class
