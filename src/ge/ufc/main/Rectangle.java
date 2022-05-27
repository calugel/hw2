package ge.ufc.main;



class Rectangle {

	// field variables
	
		private double width;
		private double length;
		
		
		
		
//		constructor method
		
//		public Rectangle(double width, double length) {
//			this.width = width;
//			this.length = length;
//		}
		
		
		
		// setter methods
		
		public void setWidth(double width) {
			this.width = width;
		}
		
		public void setLength(double length) {
			this.length = length;
		}
		
		
		// getter methods
		
		public double getWidth() {
			return width;
		}
		
		public double getLength() {
			return length;
		}
		
		public double getRectArea() {
			return width * length;
		}
		
		public double getRectPerimeter() {
			return 2 * (width + length);
		}
			
		
	
}
