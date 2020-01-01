package second;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog("Snoopy");
		Student a = new Student("Yosi",33);
		try {
			a.setAge(170);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.setName("Crazy Yosi");
		System.out.println(a);
	}

}
