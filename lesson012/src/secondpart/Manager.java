package secondpart;

public class Manager {
	//מחלקה שמייצרת אובייקטים
	private Calc calc;
	private Hashvaa hash;
	public Manager() {
		calc = new Calc();
		hash = new Hashvaa();
	}
	//פונקציה שמחזירה אובייקט מסוג מחשבון
	public Calc getCalc() {
		return calc;
	}
	public Hashvaa getHashvaa() {
		return hash;
	}
}
