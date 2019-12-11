package test;

public class Main {

	public static void main(String[] args) {
	
		//targil 3.1
		Person p1 = new Person();
		p1.date  = "11/11/1977";
		p1.name = "Yosi";
		//targil 3.2
		Person p2= new Person("11/11/1944","David");
		//targil 3.3
		Person p3= new Person("11/11/1944","Danniel","Momo","Sara");
		//targil3/4
		//creating array and adding Person objects
		Person [] persons = new Person[3];
		persons[0] = p1;
		persons[1] = p2;
		persons[2] = p3;
		//printing person name from array 
		for(Person p : persons){
			System.out.println(p.name);
		}
		//printing person 3 parents names
		System.out.println(String.format("Daniel'S father name : %s , and mother's name : %s",p3.aba.name , p3.ima.name));
		//targil  printing overrided method
		p1.eat();
	}

}
