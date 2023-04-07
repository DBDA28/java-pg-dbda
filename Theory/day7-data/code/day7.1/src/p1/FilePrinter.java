package p1;

public class FilePrinter implements Printer {
	@Override
	public void print(String someMesg) {
		System.out.println("Saving a  mesg : "+someMesg+" in the text file...");
	}
}
