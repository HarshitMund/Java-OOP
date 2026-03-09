package encapsulation;

public class Account {
	
	private String number;
	private String accountType;
	private double balance;
	
	public String getNumber() {
		return this.number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getAccountType() {
		return this.accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt) {
		this.balance += amt;
		System.out.println("New balance is: " + this.balance);
	}
	
	public void withdrawal(double amt) {
		if(this.balance < amt)
			System.out.println("Insufficient balance...");
		else {
			this.balance -= amt;
			System.out.println("New balance is: " + this.balance);
		}
	}
	
	public void payBill(double amt) {
		if(this.balance < amt)
			System.out.println("Insufficient balance...");
		else {
			this.balance -= amt;
			System.out.println("New balance is: " + this.balance);
		}
	}
	
	public void fundTransfer(Account to, int amount) {

	    if (this.getBalance() >= amount) {
	        this.withdrawal(amount);   
	        to.deposit(amount);       
	        System.out.println(amount + " transferred successfully");
	    } else {
	        System.out.println("Insufficient balance");
	    }
	}

}
