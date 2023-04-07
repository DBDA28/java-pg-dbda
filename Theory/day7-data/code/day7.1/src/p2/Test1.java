package p2;

public class Test1 {

	public static void main(String[] args) {
		//can non imple class access i/f constants  ?
		System.out.println("i/f constant "+Printer.SPEED);
		// invoke print method on different type of printer in a single for-each loop
		// If it's the FilePrinter , you should open file --print mesg n close the file
		Printer[] printers = { new ConsolePrinter(), new FilePrinter(), 
				new NetworkPrinter() };// printers : array of
																								// i/f refs : up casting
		String[] mesgs = { "mesg1", "mesg2", "mesg3" };
		int i = 0;
		for (Printer p : printers) {
			if (p instanceof FilePrinter) {
				FilePrinter fp=((FilePrinter) p);
				fp.openFile("temp.txt");
				p.print(mesgs[i++]);
				fp.closeFile("temp.txt");
			} else
				p.print(mesgs[i++]);
		}
	}

}
