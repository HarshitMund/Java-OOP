package Overriding;

public class TestShape {

	public static void main(String[] args) {

		System.out.println("----------------------------------");
		
		System.out.println("CIRCLE");
		Circle c = new Circle();
		
		c.setColor("Red");
		c.setBorderWidth(2);
		c.setRadius(5);
		
		System.out.println("Circle color: " + c.getColor()); 
		System.out.println("Circle borderWidth: " + c.getBorderWidth()); 
		System.out.println("Circle Radius: " + c.getRadius());
		c.area();
		
		System.out.println("----------------------------------");
		
		System.out.println("RECTANGLE");
		Rectangle r = new Rectangle();
		
		r.setColor("Blue");
		r.setBorderWidth(1);
		r.setLength(5);
		r.setWidth(5);
		
		System.out.println("Rectangle Color: " + r.getColor());
		System.out.println("Rectangle borderwidth: " + r.getBorderWidth());
		System.out.println("Rectangle length: " + r.getLength());
		System.out.println("Rectangle width: " + r.getWidth());
		r.area();
		
		System.out.println("----------------------------------");
		
		System.out.println("TRIANGLE");
		Triangle t = new Triangle();
		
		t.setBorderWidth(3);
		t.setColor("Green");
		t.setBase(7);
		t.setHeight(4);
		
		System.out.println("Triangle color: " + t.getColor());
		System.out.println("Triangle borderwidth: " + t.getBorderWidth());
		System.out.println("Triangle base: " + t.getBase());
		System.out.println("Triangle height: " + t.getHeight());
		t.area();
		
		System.out.println("----------------------------------");
		

	}

}
