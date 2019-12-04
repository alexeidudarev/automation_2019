package lesson10;

public class Animal {
	public String name;
	public int weigth;
	public Animal() {
		
	}
	
	
	public Animal(String s){
		name = s;
	}
	public Animal(String s, int l){
		name = s;
		weigth = l;
	}
	void eat(String food) {
		System.out.println("yam yam " +food);
	}
}
