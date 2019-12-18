package firstpart;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape shape  = new Shape("new conts invoked");
		//יצירת אובייקט מסוג מעגל
		Circle circle = new Circle(10,15,20);
		//יצירת אובייקט עם ערכים  שווים לאובייקט ראשון  דרך זימון בנאי העתקה
		Circle circle2 = new Circle(circle);
		//חישוב שטח מעגל
		double area = circle.getArea();
		System.out.println("This is circle area: "+area);

	
		
	
	}

}
