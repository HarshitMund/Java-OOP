package polymorphism;

public class TestBankByReturnType {

	public static void main(String[] args) {
		
		Bank[] bank = new Bank[3];
		
		bank[0] = Bank.getBank(1);
		bank[1] = Bank.getBank(2);
		bank[2] = Bank.getBank(3);
		
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
