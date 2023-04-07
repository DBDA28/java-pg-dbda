package exception_handling;

//example of checked exc : since InterruptedException DOES NOT extend from RuntimeExc
//javac forces handling of the chked excs
//2 ways of satisfying the javac 1. wrap the code in try-catch
//OR 2. use throws keyword
public class Test3 {

	public static void main(String[] args) throws InterruptedException{
		//Meaning => main is NOT handling the exc (if it comes !) 
		//It's delegating the exc handling to the caller : JVM --aborts the code
		System.out.println("Before sleep");
		
			Thread.sleep(5000);
		
		System.out.println("After sleep");

	}

}
