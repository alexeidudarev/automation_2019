package secondpackage;
import firstpackage.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//example of inheritance 	
		Animal a = new Animal();
		Dog d = new Dog();
		d.name = "Snoopy";
		Cat c = new Cat();
		c.name = "Mizi";
		
		//example of polymorphism
		Animal [] an = new Animal[3];
		an[0] = d;
		an[1] = c;
		
		//Exception handling example
		for(Animal z : an) {
			try {
				System.out.println(z.name);
				System.out.println("Print wow");

			}catch (NullPointerException ex){
				ex.printStackTrace();
				System.out.println("NullException : "+ex);
			}
			catch (Exception ex){
				System.out.println("Exception : "+ex);
			}
		}
		System.out.println("Print after exeption");
		
		//example of overriding
		
		//d.name = "Snoopy";
		//a.eat();
		//d.eat();
		//c.eat();;
	}

}
