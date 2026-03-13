package polymorphism;

public class TestBankByArray {

	public static void main(String[] args) {
		
		Bank[] bank = new Bank[3];
		
		bank[0] = new AXISBank();
		bank[1] = new ICICIBank();
		bank[2] = new HDFCBank();
		
		for(Bank b : bank) {
			System.out.println(b.getName());
			System.out.println(b.interestRate());
			System.out.println("--------------------");
		}

	}

}
