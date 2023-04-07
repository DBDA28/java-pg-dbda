package exception_handling;
//example of Exception API (methods inherited from Throwable)
public class Test4 {

	public static void main(String[] args) {
		try {
			int[] data = { 10, 20, 30, 40, 50 };
			System.out.println(data[1]);// AOBException
			System.out.println("int value " + Integer.parseInt("1234"));// NumberFormatExc
			int numerator = 100;
			int denominator = 0;
			System.out.println("Res " + (numerator / denominator));// ArithmeticExc
			String s = null;
			System.out.println("char at 0th index " + s.charAt(0));// NPE
			System.out.println("end of try....");
		} catch (Exception e) {
			System.out.println("in catch-all");
			System.out.println("Error message "+e.getMessage());//err mesg
			System.out.println(e);//exc class name + err mesg
			e.printStackTrace();//exc class name + err mesg + location
		}
		System.out.println("main over....");
	}

}
