package ge.ufc.main;

public class Hello {

	public static void main(String[] args) {

	
// 		TASK 3 *****************************
		
		Rectangle rect1 = new Rectangle();
		rect1.setWidth(5);
		rect1.setLength(5);
		
		System.out.println("The width of rect1 = " + rect1.getWidth());
		System.out.println("The length of rect1 = " + rect1.getLength());

		System.out.println("The Area of rect1 = " + rect1.getRectArea());
		System.out.println("The Perimeter of rect1 = " + rect1.getRectPerimeter());
		
		
//		// without initialization
//		exception "The local variable rect2 may not have been initialized"
		
		Rectangle rect2;
		System.out.println("The width of rect2 = " + rect2.getWidth());
		
		
		
//		// with the value null
//		// exception "java.lang.NullPointerException"
		
		Rectangle rect3 = null;
		System.out.println("The width of rect3 = " + rect3.getWidth());
		
		
		
//		// without setter methods
//		// the output is 0 (default value)
		
		Rectangle rect4 = new Rectangle();
		System.out.println("The width of rect4 is : " + rect4.getWidth());
		
		
		
		
		// rectangle equality
		
		 
		Rectangle rect5 = new Rectangle();
		
		
		// rect5 and rect1 has the same length and width
		rect5.setWidth(5);
		rect5.setLength(5);
		
		// the output is false because rect1 and rect5 are occupying different memory in heap 
		System.out.println(rect1 == rect5);
		
		
		rect5 = rect1;
		//now, the output is true, because, when rect1=rect5, they both occupying same memory in heap
		System.out.println(rect1 == rect5);
		
		rect5.setWidth(7);
		// because rect1 = rect5, now the setter method for rect5, changes the value for rect1
		System.out.println("The width of rect1 changed to : " + rect1.getWidth());  // output 7
		
		
		
		
	// TASK 5 *********************************

		
	if(true) {
		int y = 10;
		System.out.println("the first value of y is " + y);
	}
	
		
	for(int i=2; i<6; i++) {
		int y = 10;
		System.out.println("Element " + i + " has the value of y " + y * i);
	}
	
	int y = 60;
	System.out.println("the sixth value of y is " + y);
	
	
	}
	
	
	
//	TASK 4 ********************************
	
	
public static int Comparison(Rectangle rectangle1, Rectangle rectangle2) {
	
	if (rectangle1.getRectArea() < 0 || rectangle2.getRectArea() < 0) {
		return 404;  // error
	}
	
	if (rectangle1.getRectArea() > rectangle2.getRectArea()) {
		return 1;
	}else if(rectangle1.getRectArea() < rectangle2.getRectArea()) {
		return -1;
	}
	
	return 0;
}
	

	
}


