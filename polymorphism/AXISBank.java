package polymorphism;

public class AXISBank extends Bank {
	
	@Override
	public String getName() {
		return "AXIS Bank";
	}
	
	@Override
	public double interestRate() {
		return 10.5;
	}

}
