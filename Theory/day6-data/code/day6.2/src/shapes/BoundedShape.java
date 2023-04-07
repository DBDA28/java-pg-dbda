package shapes;

//Any time you add abstract method/s , 
//you have declare the class as abstract , o.w : javac err
public abstract class BoundedShape {
	private int x, y;

	public BoundedShape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// override toSAtring() , inherited from Object class , to replace hashCode
	// version by actual details
	@Override
	public String toString() {
		return "x=" + x + " y=" + y;
	}

	// add a method to return computed area of a bounded shape
	// abstract method declaration
	public abstract double area();
//	{
//		return -1;
//	}

}
