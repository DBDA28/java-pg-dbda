package p2;

public class ConsolePrinter implements Printer {
	//can imple class DIRECTLY (w/o i/f name) access i/f constant ? YES
	@Override
	public void print(String someMesg) {
		System.out.println("Printing mesg : "+someMesg+" on the console...");
		System.out.println("Printing speed : "+SPEED);
	}
}
