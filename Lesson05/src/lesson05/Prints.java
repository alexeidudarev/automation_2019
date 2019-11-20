package lesson05;

public class Prints {
	
	public void printArr(int [] arr) {
		for(int x = 0;x < arr.length;x++) {
			System.out.print(arr[x]);
		}
	}
	public static void printMax(int[] arr) {
		int max= 0;
		int min = arr[0];
		for(int x = 0;x < arr.length;x++) {
			if (arr[x]>max) {
				max =arr[x];
			}
			if (arr[x]<min) {
				min =arr[x];
			}
			
		}
		System.out.println("the max num i :" + max);
		System.out.println("the min num i :" + min);
	}

}
