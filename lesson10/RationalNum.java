package lesson10;

public class RationalNum extends Number{
	int numenator,denumenator;
	public RationalNum(){
		
	}
	
	public RationalNum(int x, int y) {
		numenator = x;
		denumenator = y;
	}





	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return numenator/(double)denumenator;
	}

}
