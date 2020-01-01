package second;

public class Student {
	private String name;
	private int age;
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		
		return age;
	}
	public void setAge(int age) throws Exception {
		if (age < 0 || age > 160) {
			throw new Exception("cant be real student");
		}else {
			this.age = age;

		}
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
