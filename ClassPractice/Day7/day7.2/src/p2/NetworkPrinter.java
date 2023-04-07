package p2;

public class NetworkPrinter implements Printer{
	
	
	@Override
	public void print(String someMesg) {
		System.out.println("sending mesg: "+someMesg+"   to the server ...");
		
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
