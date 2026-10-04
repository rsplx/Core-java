package constructor;

public class circle extends Shape {

	private int radius;

	public circle() {

	}
	public circle(int radius, String color, int borderWidth) {
		super(borderWidth, color);
		this.radius = radius;

		System.out.println(this.radius);
	}
}