package p1;

public class D implements C {
	private double d1;
	private double d2;
	
	public D() {
	}

	@Override
	public double add(double d1, double d2) {
		return d1+d2;
		
	}

	@Override
	public void print(String mesg) {
		System.out.println("in D print"+mesg);
	}

	@Override
	public boolean isEven(int num) {
		// TODO Auto-generated method stub
		return false;
	}

}
