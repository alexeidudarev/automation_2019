package lesson10home;

public class Man {
	String name;
	int hight;
	//empty constructor 
	public Man(){
		
	}
	//constructor with one parameter
	public Man(String n){
		name = n;
	}
	//constructor with two parameter
	public Man(String n,int h){
		name= n;
		hight = h;
	}
	public void eat(){
		System.out.println("i am eating ");
	}
}
