
public class test2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};//ArrayOutBoundException
		try {
		System.out.println("int value"+Integer.parseInt("123jfsl"));//1. NumberFormatException
		int denominator = 0;
		int numerator = 10;
		System.out.println("Division Result"+(numerator/denominator));//2. ArithmeticException
		String s=null;
		System.out.println("char at 0th index"+s.charAt(0));//3. NullPointerException
		}
//		catch (NumberFormatException e) {
//			System.out.println("error 1");
//		}
		catch(ArithmeticException e) {
			System.out.println("error 2");
		}
		catch(NullPointerException e) {
			System.out.println("error 2");
		}
		catch(Exception e) {
			System.out.println("in catch all block");
			
		}
		System.out.println("end of main");
		
	}//end of main

}
