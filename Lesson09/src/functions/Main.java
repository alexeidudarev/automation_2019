package functions;

public class Main {
	
	public static void main(String [] args) {
		
		Dog pappi = new Dog();
		int r = pappi.getAge();
		System.out.println(r);
		pappi.setAge(-10);
		
		System.out.println(pappi.getAge());
		
		
		
		
		
		
		
		
		
		
		
		class Animal{
			public int weigth ;
			protected int age;
			private String name;
			void eat(String s) {
				System.out.println(s+ " is eating");
			}
			void speak(String s) {
				System.out.println("Hello i am a "+s);
			}	
		}
		
		Animal zav = new Animal();
		zav.age = 100; 
		zav.weigth = 1;
		zav.age=0;
		zav.name= "Dani";
		System.out.println(zav.name + "-> zav name");
		//zav.eat("Zav");
		
		int t = 0;
	
		Animal cat = new Animal();
		cat.age = 5;
		cat.weigth = 10;
		//cat.eat("Cat");
		cat.speak(" CAT");
		cat.name = "Mizi";
		//print("Hello");
		//pow(9);
		//int sum = 2 + pow2(3);
		//System.out.println(sum);
		//printArr(arr);
		
		int [] arr= {1,2,3};
		int [] arr2= {4,5,6,7,9};
		int [] arr3 = add(arr,arr2);
		//printArr(arr3);

		
	}
	public static int[] add(int [] first, int [] second){
		int length = first.length + second.length;
		int [] array = new int[length];
		int count = 0;
		for(int i = 0; i< length ; i++) {
			if(i < first.length) {
				array[i] = first[i];
			}else if(i>=first.length && i < array.length){
				array[i] = second[count++];
			}
		}
	
		return array;
	}

	
	
	public static void printArr(int [] arr) {
		for(int y : arr) {
			System.out.print(y);
		}
	}
	
	
	
	public static int pow2(int x) {
		int sum = x*x;
		//System.out.println(sum);
		return sum;
	}
	public static void pow(int x) {
		int sum = x*x;
		System.out.println(sum);
	}
	public static void print(String str) {
		System.out.println(str);
	}
	
}
