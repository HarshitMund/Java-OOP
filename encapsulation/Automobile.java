package encapsulation;

public class Automobile {
	
	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS = 6; 
	private int gear;
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void breaks() {
		if(this.speed < 10) {
			System.out.println("Speed after break: 0");
		}
		else {
			this.speed -= 10;
			System.out.println("Speed after break: " + this.speed);
		}
	}
	
	public void accelerator() {
		if(this.speed >= 220)
			System.out.println("Speed limit excided. Please apply break..."); 
		else
			System.out.println("Speed is: " + (this.speed + 10));
	}
	
	public int getGear() {
	    return this.gear;
	}

	public void setGear(int gear) {
	    this.gear = gear;
	}
	
	public void changeGear(String direction) {

	    if(direction.equalsIgnoreCase("up")) {

	        if(this.gear < NO_OF_GEARS) {
	            this.gear++;
	            System.out.println("Gear changed to: " + this.gear);
	        } 
	        else {
	            System.out.println("Already in highest gear");
	        }

	    } else if(direction.equalsIgnoreCase("down")) {

	        if(this.gear > 1) {
	            this.gear--;
	            System.out.println("Gear changed to: " + this.gear);
	        } 
	        else {
	            System.out.println("Already in lowest gear");
	        }

	    } else {
	        System.out.println("Invalid gear direction");
	    }
	}
	

}
