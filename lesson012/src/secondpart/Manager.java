package secondpart;

public class Manager {
	//����� ������� ���������
	private Calc calc;
	private Hashvaa hash;
	public Manager() {
		calc = new Calc();
		hash = new Hashvaa();
	}
	//������� ������� ������� ���� ������
	public Calc getCalc() {
		return calc;
	}
	public Hashvaa getHashvaa() {
		return hash;
	}
}
