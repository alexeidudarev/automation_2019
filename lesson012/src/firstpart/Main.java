package firstpart;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape shape  = new Shape("new conts invoked");
		//����� ������� ���� ����
		Circle circle = new Circle(10,15,20);
		//����� ������� �� �����  ����� �������� �����  ��� ����� ���� �����
		Circle circle2 = new Circle(circle);
		//����� ��� ����
		double area = circle.getArea();
		System.out.println("This is circle area: "+area);

	
		
	
	}

}
