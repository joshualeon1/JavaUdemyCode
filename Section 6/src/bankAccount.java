//	04.15.2021

public class bankAccount {

	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	//Creating out Constructor which essentially helps set the variable(s) to an initial value(s)
	public bankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
		System.out.println("Account constructor with parameters called.");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}//end bankAccountConstructor
	
	public String getAccountNumber() {
		return accountNumber;
	}//end getAccountNumber
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}//end setAccountNumber
	
	public double getBalance() {
		return balance;
	}//end getBalance
	
	public void setBalance(double balance) {
		this.balance = balance;
	}//end setBalance
	
	public String getCustomerName() {
		return customerName;
	}//end getCustomerName
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}//end setCustomerName
	
	public String getEmail() {
		return email;
	}//end getEmail
	
	public void setEmail(String email) {
		this.email = email;
	}//end setEmail
	
	public String getPhoneNumber() {
		return phoneNumber;
	}//end getPhoneNumber
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}//end setPhoneNumber
	
	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + this.balance);
	}//end deposit
	
	public void withdrawal(double withdrawalAmount) {
		if(this.balance - withdrawalAmount < 0) {
			System.out.println("Only $" + balance + " available. Withdrawal not processed.");
		} else {
			this.balance -= withdrawalAmount;
			System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining balance = $" + this.balance);
		}//end if-else
		
	}//end withdrawal
	
}//end class
