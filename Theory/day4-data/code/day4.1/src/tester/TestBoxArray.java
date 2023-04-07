package tester;
import java.util.Scanner;
import com.acts.Box;

/*
 * Create a tester class  : TestBoxArray : "tester"

Objective : Ask user(client) , how many boxes to make ?
Accept Box dims 

Store these details suitably.

1. Display using single for-each loop, box dims n volume

 */
public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of boxes to make");
		//create Box[] to hold Box type of refs
		Box[] boxes=new Box[sc.nextInt()];//10 , how many objs ? : 1 array obj
		//display array data : for-each
		for(Box b : boxes)//b=boxes[0],b=boxes[1]....
			System.out.println(b);
		//accept box dims --create box objs --store the ref in the array
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter box dims ");
			boxes[i]=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		//display box dims n volume : for-each
		for (Box b : boxes)//b=boxes[0],b=boxes[1]...
		{
			System.out.println(b.getBoxDims());
			System.out.println("vol "+b.getComputedVolume());
		}
		//update width : for those boxes , vol > 100
		for(Box b : boxes) //b=boxes[0],b=boxes[1]...b=boxes[boxes.length-1]
		{
			if(b.getComputedVolume()>100)
				b.setWidth(b.getWidth()*2);
		}
		System.out.println("Displaying box info again");
		for(Box b : boxes)//b=boxes[0],b=boxes[1]....
			System.out.println(b.getBoxDims());
	
		sc.close();

	}

}
