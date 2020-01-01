package first;

public class Calc {
	public int a = 3;
	public Calc(){
		this.a = 5;
	}
	public static  int add(int x, int y) {
		return x+y;
	}
	public double dev(int x, int y) throws Exception {
		return x/y;
	}

}
