package p1;

public class Test1 {

	public static void main(String[] args) {
		//direct ref.
		ConsolePrinter cp=new ConsolePrinter();
		cp.print("mesg 1");
		FilePrinter fp=new FilePrinter();
		fp.print("mesg2");
		NetworkPrinter np=new NetworkPrinter();
		np.print("mesg3");

	}

}
