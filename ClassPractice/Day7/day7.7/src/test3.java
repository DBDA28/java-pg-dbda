
//Demo: checked exceptions e.g InterruptedException
//javac forces handling of checked exceptions
	//1. either by try-catch block
	//2. or by using throws keyword

//try-catch
public class test3 {
	public static void main(String[] args) {
		System.out.println("before");
		try {
		Thread.sleep(5000);
		}
		catch(InterruptedException e){
			System.out.println("error");
			
		}
		System.out.println("after");
		
	}

}

//throws
//public class test3 {
//	public static void main(String[] args) throws InterruptedException {
//		System.out.println("before");
//		Thread.sleep(5000);
//		System.out.println("after");
//		
//	}
//
//}
