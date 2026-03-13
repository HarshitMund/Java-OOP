package Overriding;

public class HDFCBank extends Bank{
	
	@Override
	public String getName() {
		return "HDFC Bank";
	}
	
	@Override
	public double interestRate() {
		return 9.0;
	}

}
