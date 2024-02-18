//	04.16.2021
public class VipCustomer {

	//Our fields below:
	private String name;
	private double creditLimit;
	private String emailAddress;
	
	//1st constructor
	public VipCustomer() {
		this("Default Name", 50000.00, "bobBrown@gmail.com");
	}
	
	//2nd constructor
	public VipCustomer(String name, double creditLimit) {
		this(name, creditLimit, "unknown@gmail.com");
	}
	
	//3rd constructor
	public VipCustomer(String name, double creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	
	//Getters below:
	public String getName() {
		return name;
	}//end getName
	
	public double getCreditLimit() {
		return creditLimit;
	}//end getCreditLimit
	
	public String getEmailAddress() {
		return emailAddress;
	}//end getEmailAddress
	
}//end class
