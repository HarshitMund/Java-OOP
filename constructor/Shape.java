package constructor;

public class Shape {
	
	protected String color;
	protected int borderWidth;
	
	public Shape() {
		System.out.println("This is the default color and borderwidth");
	}
	
	public Shape(String color) {
		this();
		this.color = color;
		System.out.println(this.color);
	}
	
	public Shape(String color, int borderWidth) {
		this(color);
		this.borderWidth = borderWidth;
		System.out.println(this.borderWidth);
	}

}
