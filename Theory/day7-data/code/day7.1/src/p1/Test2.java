package p1;

public class Test2 {

	public static void main(String[] args) {
		// indirect ref.
		Printer p;// p : interface type of ref ,
		// mem allocated in stack(local var),size : JVM dependent
		p = new ConsolePrinter();// up casting , using "implements" => IS A
		// Interface ref can DIRECTLY (w/o type casting) refer to ANY imple class
		// instance
		p.print("some mesg");// run time poly. : print(..) to be invoked on which 
		//object : is decided by JVM
		p=new NetworkPrinter();//up casting
		p.print("another mesg");//run time poly.
		p=new FilePrinter();
		p.print("mesg1234");

	}

}
