import java.util.Scanner;
public class Testbox {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);			
	BoxDetails b1;//class type of reference which can point to BoxDetails type of the object
	              //allocated in the stack  
	//prompt user for the box dims
	System.out.println("Enter the box dimensions w h d");
	b1 = new BoxDetails(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
	BoxDetails b2 = new BoxDetails(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
	System.out.println(b1.toString()+" "+ b2.toString());
	System.out.println("Volume:" + b1.Volume() +" "+ b2.Volume());
	
	//b2 = null;
	//System.out.println(b2.toString());
	//System.out.println(b2.Volume());
	System.out.println("cntd..");
	sc.close();
	
	}

}
