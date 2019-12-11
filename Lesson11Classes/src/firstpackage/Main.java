package firstpackage;
import secondpackage.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data  data= new Data();
		//data.boss = "";
		Dog dog = new Dog();
		
		
		
		//abstraction example
		ClassA some = new ClassA();
		some.name = "Automation";
		some.more = "Itzik";
		//System.out.println(some.name);
		some.location = "Jerusalem";
		some.student.name = "Freddy";
		System.out.println(some.student.name);
		
		ClassA some2 = new ClassA();
		some2.name = "QA";
		some.name = "Automation 2019";
		//System.out.println(some2.name);
		
		ClassA some3 = new ClassA("Front-End","Jerusalem");
		//System.out.println("The location :"+some3.location);
		some3.name = "QA";
		//some3.student = new Student();
		System.out.println(some3.student.age);
	}

}
