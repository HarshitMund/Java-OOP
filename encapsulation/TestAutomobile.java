package encapsulation;

public class TestAutomobile {

	public static void main(String[] args) {
		
		Automobile a1 = new Automobile();
		
		a1.setColor("Black");
		a1.setSpeed(160);
		a1.setMake("Ford");
		
		System.out.println(a1.getColor());
		System.out.println(a1.getSpeed());
		System.out.println(a1.getMake());
		
		System.out.println("-----------------------------------");
		
		Automobile a2 = new Automobile();
		
		a2.setColor("White");
		a2.setSpeed(220);
		a2.setMake("Toyota");
		
		System.out.println(a2.getColor());
		System.out.println(a2.getSpeed());
		System.out.println(a2.getMake());
		

	}

}
