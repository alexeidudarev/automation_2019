package functions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum(2,3);
		for(int i = 0;i<0;i++){
			multy(4,5);
		}
		int [] arr = {1,2,3,4,5};
		printArr(arr);
		
	}
	
	
	
	
	
	public static void printArr(int[]arr) {
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
	public static void multy(int x, int y) {
		
		System.out.println(x*y);
	}
	public static void sum(double x, double y) {
		
		System.out.println(x+y);
	}
	public static void sum(int x, int y) {
		
		System.out.println(x+y);
	}
	public static void sum(int x) {
		
		System.out.println(x+x);
	}
	public static void sum() {
		int x= 90;
		int y = 1;
		
		System.out.println(x+y);
	}

}
