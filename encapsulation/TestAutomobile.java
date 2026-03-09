package encapsulation;

public class TestAutomobile {

	public static void main(String[] args) {
		
		Automobile a1 = new Automobile();
		
		a1.setColor("Black");
		a1.setSpeed(60);
		a1.setMake("Ford");
		
		System.out.println("a1 color is: " + a1.getColor());
		System.out.println("a1 speed is: " + a1.getSpeed());
		System.out.println("a1 make is: " + a1.getMake());
		a1.breaks();
		a1.accelerator();
		a1.setGear(1);

		a1.changeGear("up");    
		a1.changeGear("up");    
		a1.changeGear("down");  
		
		System.out.println("-----------------------------------");
		
		Automobile a2 = new Automobile();
		
		a2.setColor("White");
		a2.setSpeed(80);
		a2.setMake("Toyota");
		
		System.out.println("a2 color is: " + a2.getColor());
		System.out.println("a2 speed is: " + a2.getSpeed());
		System.out.println("a2 make is: " + a2.getMake());
		a2.breaks();
		a2.accelerator();

	}

}
