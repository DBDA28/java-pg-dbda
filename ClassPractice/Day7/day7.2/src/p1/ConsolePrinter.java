package p1;

public class ConsolePrinter implements Printer{
	
	
	@Override
	public void print(String someMesg) {
		System.out.println("Printing mesg: "+someMesg+" on the console...");
		
	}//end of print method
	
}//end of ConsolePrinter
