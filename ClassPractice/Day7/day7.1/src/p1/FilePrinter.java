package p1;

public class FilePrinter implements Printer{
	
	
	@Override
	public void print(String someMesg) {
		System.out.println("saving mesg: "+someMesg+" in a text file");
		
	}//end of print method
	
}//end of ConsolePrinter
