package test;
import p1.Computable;
public class tester1 {

	public static void main(String[] args) {
		//declarative style of programming: functional programming
		System.out.println(testCompute(11, 12, (a,b) -> a+b));
		System.out.println(testCompute(15, 6, (a,b) -> a%b));
		
		int a=100;//assigning int value
		String s="fjslfj";//string literal
		//function literal
		Computable ref=(x,y)->x*y;
		System.out.println(testCompute(10, 20, ref));
	}
	//add static method to test any math operation.
	//any method which either accepts or returns (or both) the functionality
	private static double testCompute(double a, double b, Computable ref) {//higher order function/method

		return ref.compute(a, b);
	}
}
