package shapes;

public class Rectangle extends BoundedShape {
	private double length,breadth;
	 public Rectangle(int x,int y,double len,double breadth) {
		super(x,y);
		length=len;
		this.breadth=breadth;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*breadth;
	}
	//override toString to ret complete state details
	@Override
	public String toString()
	{
		return "Rect "+super.toString()+" len="+length+" breadth="+breadth;
	}
	

}
