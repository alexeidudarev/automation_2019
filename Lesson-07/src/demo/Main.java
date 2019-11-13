package demo;

import java.util.Scanner;

public class Main {
	
	//public static Scanner scanner;
		public static void main(String[] args) {
		String s = new String("TRUe automation class!");
		char ch [] = s.toCharArray();
		for(char c : ch) {
			System.out.println(c);
		}
		
		System.out.println(s.toUpperCase());
		System.out.println(s.contains("Helle"));
		String w = s.toLowerCase();
		System.out.println(s.toUpperCase());
		System.out.println(s.substring(0,5));
		
		boolean isequal = s.contains("Hello"); 
		isequal = Boolean.parseBoolean(s.substring(0, 5).toLowerCase());
		if (isequal) {
			System.out.println("Yes its true");
		}else {
			System.out.println("No its note");
		}
		
		String [] words = s.split(" ");
		
		
			
			
			/*
			 * 
			 * 
			 * 
			 String str = "\n"
				+ ""
				+ "   Moshe";
		str +=" yeled tov"
				+ ""
				+ " \n";
		String s = str.trim();
		System.out.println(str.trim());
		System.out.println(s);
		System.out.println(str.length());
		System.out.println(str.charAt(4));
			
			 
			 //cope one array to another
			 int [] nums = {22,44,67,100,75};
			int [] arr = new int [2];
			arr = new int [nums.length];
			for(int i = 0; i < nums.length ; i++) {
				arr[i] = nums[i];
				System.out.println(arr[i]);
			}
			 
			 
			//array length change

			int [] arr = new int [2];
			arr[0] = 1;
			int [] arr2 = arr;
			
			arr2[0] = -1;
			System.out.println(arr[0]);
			 
			 
			 
			 //do while example with menu
			 int i  ;
			
			do {
				System.out.println("Make you choise ");
				System.out.println("Press 1 to continue");
				System.out.println("Press 2 to print hello world");
				System.out.println("Press 3 to finish");
				
				scanner = new Scanner(System.in);
				i = scanner.nextInt();
				
				switch(i) {
				case 3:
					System.out.println("Programm finished with exit"
							+ "code 0");
					break;
				case 2:
					System.out.println("Hello world ! - printed \n");
					break;
				case 1:
					System.out.println("Num 1 pressed \n");
					break;
				default:
						System.out.println("Press another button");
					
				}
				
				
				
			}while(!(i == 3)); 
			
	
			 
			 
			 
			 * 
			 * 
			 * 
			//casting form double to int
			double pi = 3.14;
			int x = (int)pi;
			int y = (int)(pi*10)%30;//31.4%30/1.4
			int z = (int)(pi*100)%310;
			System.out.println(z);
			*/
		}

}
