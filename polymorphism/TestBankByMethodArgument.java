package polymorphism;

public class TestBankByMethodArgument {

	public static void main(String[] args) {
		
		Bank[] bank = new Bank[3];
		
		bank[0] = new AXISBank();
		bank[1] = new ICICIBank();
		bank[2] = new HDFCBank();
		
		loanEnquire(bank);
	}
		
		public static void loanEnquire(Bank[] bank) {
			for(Bank b : bank) {
				System.out.println(b.getName());
				System.out.println(b.interestRate());
				System.out.println("--------------------");
			}

	}

}
