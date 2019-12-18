package secondpart; 

public class Main extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//זימון פונקציה סטטית 
		//Calc.add(1, 4);
		
		//העפלה פונקציה דרך אובייקט סטטי 
		app.getCalc().devide(1, 0);
		
	
		
		/*
		 *
		 * 
		 * 
		 *
		Calc calc = new Calc();
		double x = calc.devide(3, 2);
		//זימון פונקציה דרך אובייקט
		System.out.println(calc.devide(3, 0));
		 
		 //הסמה ערכים רנדומליים לתוך מערך
		 int [] arr = new int [100];
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = (int)(Math.random()*100 + 1 );
		}
		for(int x : arr) {
			System.out.println(x);
		}
		  
		  
		 while (1 < 2){
			rand = Math.random();
			System.out.println(rand);

		}
		//יצירת מספר רנדומלי בין 0 ל 99
		int rand = (int)(Math.random()*100 );
		System.out.println(rand);
		 
		 
		 ///פונקציה IF מקוצרת
		boolean isTrue = false;
		int x = 1;
		isTrue = x < 6 ? true : false;
		///פונקציה IF מקוצרת

		String str = (x > 6) ? "Zodek": "Mamash le";
		
		if(x < 6) {
			isTrue = true;
		}else {
			isTrue = false;
		}
		
		//System.out.println(isTrue);
		 * */
		 
	}

}
