package p2;

public class NetworkPrinter implements Printer {
	@Override
	public void print(String someMesg) {
		System.out.println("Sending a mesg : "+someMesg+" to the server....");
	}
}
