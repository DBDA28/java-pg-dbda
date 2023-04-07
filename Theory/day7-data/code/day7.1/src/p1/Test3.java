package p1;

public class Test3 {

	public static void main(String[] args) {
		//invoke print method on different type of printer in a single for-each loop
		Printer[] printers= {new ConsolePrinter(),
				new FilePrinter(),new NetworkPrinter()};//printers : array of i/f refs : up casting
		String[] mesgs= {"mesg1","mesg2","mesg3"};
		int i=0;
		for(Printer p : printers)
			p.print(mesgs[i++]);
	}

}
