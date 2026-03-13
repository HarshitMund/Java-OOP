package polymorphism;

public class Bank {
	
	public String getName() {
		return "RBI Bank";
	}
	
	public double interestRate() {
		return 11.0;
	}
	
	public static Bank getBank(int i) {
		
		if(i == 1)
			return new HDFCBank();
		if(i == 2)
			return new ICICIBank();
		if(i == 3)
			return new AXISBank();
		
		return new Bank();
	}

}
