package constructor;

public class Triangle extends Shape {

	private int base;
	private int height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
		System.out.println(this.base);
		System.out.println(this.height);
	}
	
	public Triangle(String color, int borderWidth, int base, int height) {
		super(color, borderWidth);
		this.base = base;
		this.height = height;
		System.out.println(this.base);
		System.out.println(this.height);
	}
	
}
