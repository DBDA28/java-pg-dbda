package p2;

public class ConsolePrinter implements Printer{
	
	
	@Override
	public void print(String someMesg) {
		System.out.println("Printing mesg: "+someMesg+" on the console...");
		
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
