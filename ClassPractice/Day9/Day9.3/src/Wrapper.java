
import java.time.*;
import java.util.Scanner;
public class Wrapper {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			int data=1234;
			Integer I= Integer.valueOf(data);//explicit conversion boxing
			double d1=123.43;
			Double D= Double.valueOf(d1);
			double val= D.doubleValue();//unboxing
			Integer i2=1345 ; //auto boxing
			Double d2 =34.56; //auto boxing
			//Double d3 =12.34f; //float--------->auto boxing---------->Float---->upcasting to Double cannot be done
			double d4 =12.34f; //widening
			Number n1=12.346f; //float--->Float.auotboxing--->upcasting-->Number
			n1=123.4569;
			Object o =true;//boolean--->Boolean---->Object
			o=45;
			//Java is not pure OOPS but object type of reference can directly refer to any type
			System.out.println(data +" "+I+" "+d1+" "+D+" "+val+" "+i2+" "+d2+" "+d4+" "+n1+" "+o);
	}

}
}