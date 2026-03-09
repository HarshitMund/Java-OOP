package encapsulation;

public class TestAccount {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		
		a1.setNumber("8812389523752");
		a1.setAccountType("Saving");
		a1.setBalance(5000);
		
		System.out.println("a1 account number is: " + a1.getNumber());
		System.out.println("a1 account type is: " + a1.getAccountType());
		System.out.println("a1 balance is: " + a1.getBalance());
		a1.deposit(2000);
		a1.withdrawal(10000);
		a1.payBill(1000);
		
		System.out.println("-----------------------------------");
		
		Account a2 = new Account();
		
		a2.setNumber("76242985239836532");
		a2.setAccountType("Current");
		a2.setBalance(12345);
		
		System.out.println("a2 account number is: " + a2.getNumber());
		System.out.println("a2 account type is: " + a2.getAccountType());
		System.out.println("a2 balance is: " + a2.getBalance());
		a2.deposit(4231);
		a2.withdrawal(500);
		a2.payBill(1000);
		

		a1.fundTransfer(a2, 2000);
		
	}

}
