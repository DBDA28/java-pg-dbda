package p1;

public class NetworkPrinter implements Printer{
	
	
	@Override
	public void print(String someMesg) {
		System.out.println("sending mesg: "+someMesg+"   to the server ...");
		
	}//end of print method
	
}//end of ConsolePrinter
