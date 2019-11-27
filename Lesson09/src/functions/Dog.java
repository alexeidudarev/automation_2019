package functions;

public class Dog {
	private int age = 0;
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		if (a > 0) {
			age = a;
		}else {
			System.out.println("Are you crazy");
		}
		
	}
}
