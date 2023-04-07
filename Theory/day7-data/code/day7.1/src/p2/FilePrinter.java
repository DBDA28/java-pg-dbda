package p2;

public class FilePrinter implements Printer {
	@Override
	public void print(String someMesg) {
		System.out.println("Saving a  mesg : "+someMesg+" in the text file...");
	}
	//add new functionality
	//open file
	public void openFile(String fileName)
	{
		System.out.println("Opening file"+fileName);
	}
	//close file
	public void closeFile(String fileName)
	{
		System.out.println("Closing file"+fileName);
	}
}
