package p2;

public class FilePrinter implements Printer{
	
	
	@Override
	public void print(String someMesg) {
		System.out.println("saving mesg: "+someMesg+" in a text file");
		
	}//end of print method


	//open file
	public void openFile(String fileName) {
		System.out.println("Opening file"+fileName);
	}

	//close file
	public void closeFile(String fileName) {
		System.out.println("Closing file"+fileName);
	}
	
}//end of ConsolePrinter
