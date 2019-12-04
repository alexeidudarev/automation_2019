package lesson10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number [] nums = new Number[4];
		nums[0] = 10;
		nums[1]=10.0;
		short b =10;
		nums[2] = b;
		nums[3] = new RationalNum(1,4);
		sum(nums);
		
		
		
		
		
		
		
		
		
		
		Animal animal = new Animal("Mouse");
		Animal someA = new Animal("Lion", 250);
		//animal.name = "No name";
	
		System.out.println(animal.name);
		//animal.eat("Banana");
		Dog dog = new Dog();
		dog.name = "Snoopy";
		dog.legs = 4;
		
		Poodle poodle = new Poodle();
		poodle.colMeazben = true;
		
	}
	public static void sum(Number [] nums) {
		double sum = 0;
		for(Number x : nums ) {
			sum = sum + x.doubleValue();
		}
		System.out.println("the sum is :"+sum);
	}
}
