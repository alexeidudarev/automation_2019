package lesson10home;

public class Person extends Man {
	public String date;
	public Person aba;
	public Person ima;
	//empty constructor 
	public Person(){
		
	}
	//constructor with one parameter
	public Person(String date){
		aba = null;
		ima = null;
	}
	//constructor with two parameter
	public Person(String d , String n ){
		date = d;
		name = n;
		aba = null;
		ima = null;
	}
	//constructor with 4 parameter
	public Person(String d, String n,String a,String i ){
		aba = new Person();
		aba.name = a;
		ima = new Person ();
		ima.name = i;
		date = d;
		name = n;
		
	}
	@Override
	public void eat(){
		System.out.println("i am eating lunch");
	}

}
