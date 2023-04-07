
public class test1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};//ArrayOutBoundException
		System.out.println("int value"+Integer.parseInt("123fjs"));//NumberFormatException
		int denominator = 0;
		int numerator = 10;
		System.out.println("Division Result"+(numerator/denominator));//ArithmeticException
		String s=null;
		System.out.println("char at 0th index"+s.charAt(0));//NullPointerExeption
		
	}//end of main

}
