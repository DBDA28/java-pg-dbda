package exception_handling;

//example of checked exc : since InterruptedException DOES NOT extend from RuntimeExc
//javac forces handling of the chked excs
//2 ways of satisfying the javac 1. wrap the code in try-catch
//OR 2. use throws keyword
public class Test2 {

	public static void main(String[] args) {
		System.out.println("Before sleep");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("err occurred!");
		}
		System.out.println("After sleep");

	}

}
