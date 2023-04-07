package offset;
import java.util.Scanner;
class TestBox {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the dimensions of the box");
		Box b1 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println(b1.getBoxDims());
		System.out.println("enter the offset values");
		Box b2= b1.createNewBox1(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		//Box b2=b1.createNewBox1(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		//b1.createNewBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println(b2.getBoxDims());
		sc.close();
	}
}
