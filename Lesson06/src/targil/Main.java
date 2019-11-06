package targil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//יצירת מערך דו-ממידי
		int [][] arr = {{1},{1,2},{3,4,4},{5,6,7,8}};
		//דפסה מערך דו-ממימדי
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
		

		 //הדפסה מערך דו-ממידי בעזרת פונקציה fore-each
		 for(int x[] : arr) {
			for(int y : x) {
				System.out.print(y + " ");
			}
			System.out.println(" ");
		}
		 
		  
		  
		  
		  
		//יצירת משתנה מסוג מערך
		int [] array ;
		//פקודת הסמה
		array = new int[8];
				
		//הדפסת שמות ממערך
		String [] names1 = {"Peter","Moshe","Yuval"};
		for(int i = 0; i < names1.length; i++) {
			System.out.println("my array :" + names1[i]);
		}
		//הדפסת מתוך שני מערכים
		String [] towns  = {"Bnei brak","Rishon","Haifa","Holon"};
		String [] names = {"Moshe","Yuval","Ziv","Kobi"};
		for(int i = 0; i < names.length; i++) {
			
			System.out.println(names[i] + " from " + towns[i]);
		}
		 
		//חיפוש מספר במערך 
		double [] numsArr = {2.0, 3.6 ,5.6, 3.6};
		boolean found = false;
		for(int i = 0; i < numsArr.length; i++) {
			if(numsArr[i] == 3.6) {
				found = true;
				break;
				
			}
			System.out.println("Is found");
		}
		System.out.println("2.0 is found :" + found);
		  
		
		//חיבור שני מספרים בתוך פקודת הדפסה
		System.out.println("the print array  : " + (numsArr[1] + 7));
	}

}
