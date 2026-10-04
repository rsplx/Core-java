package in.co.rays.oop;

	public class circle extends shape {
		
		private int radius ;

		public int getRadius() {
			return radius;
		}

		public void setRadius(int radius) {
			this.radius = radius;
		}
		
		public void area () {
			System.out.println("area of circle"+(Math.PI * radius * radius));
		}

	}
	
