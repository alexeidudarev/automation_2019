package firstpackage;

public class ClassA {
	String name;
	String location;
	Student student;
	public static String more = "Yosi";

	public ClassA() {
		this.name = new String();
		this.student = new Student();
		this.student.age = 10;
	}
	public ClassA(String name) {
		this.name = name;
	}
	public ClassA(String name,String location) {
		this.name = name;
		this.location = location;
		this.student = new Student();
		this.student.age = 10;
	}
	
	
}
