package constructor;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle(String color, int borderWidth, int radius) {
		super(color, borderWidth);
		this.radius = radius;
		System.out.println(this.radius);
	}

}
