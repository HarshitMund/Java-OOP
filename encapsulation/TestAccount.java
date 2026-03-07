package encapsulation;

public class TestAccount {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		
		a1.setNumber("8812389523752");
		a1.setAccountType("Saving");
		a1.setBalance(5000);
		
		System.out.println(a1.getNumber());
		System.out.println(a1.getAccountType());
		System.out.println(a1.getBalance());
		
		System.out.println("---------------------------------");
		
		Account a2 = new Account();
		
		a2.setNumber("76242985239836532");
		a2.setAccountType("Current");
		a2.setBalance(123345);
		
		System.out.println(a2.getNumber());
		System.out.println(a2.getAccountType());
		System.out.println(a2.getBalance());
		
	}

}
