package in.co.rays.oop;

public class testcircle {
	public static void main(String[] args) {
		
		shape s = new shape();
		
		s.setBorderWidth(56);
		s.setColor("red");
		
		
		shape c = new circle();
		
		circle c1 = (circle)c;
		
		c1.setBorderWidth(56);
		c1.setColor("red");
		c1.setRadius(65);
		c1.area();
		
		System.out.println(c1.getBorderWidth());
		System.out.println(c1.getColor());
		System.out.println(c1.getRadius());
		
		
	}
}