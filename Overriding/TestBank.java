package Overriding;

public class TestBank {

	public static void main(String[] args) {
		
		Bank b1 = new AXISBank();
		
		System.out.println(b1.getName());
		System.out.println(b1.interestRate());
		
		Bank b2 = new ICICIBank();
		
		System.out.println(b2.getName());
		System.out.println(b2.interestRate());
		
		Bank b3 = new HDFCBank();
		
		System.out.println(b3.getName());
		System.out.println(b3.interestRate());

	}

}
