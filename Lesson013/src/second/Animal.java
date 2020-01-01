package second;

public abstract class Animal {
	String name;
	public Animal(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println("i am eating");
	}
	public abstract void makeSound();
	public abstract String sayHi();
	public abstract int getAge(int x);
}
