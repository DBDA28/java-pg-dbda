import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Calc();
		
		
	}

	static void Calc()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number: ");
		double a = sc.nextInt();
		System.out.println("enter the second number: ");
		double b = sc.nextInt();
				String c ;
		System.out.println("Enter the operation you want to perform: add|sub|del|mult|quit ");
		c = sc.next();
		switch(c)
	
	{
	case "add" :
		System.out.println("The sum of the two numbers is :" + (a+b));
		Calc();
		break;
	case "sub" :
		System.out.println("The sum of the two numbers is :" + (a-b));
		Calc();
		break;		
	case "del" :
		System.out.println("The sum of the two numbers is :" + (a/b));
		Calc();
		break;
	case "mult" :
		System.out.println("The sum of the two numbers is :" + (a*b));
		Calc();
		break;
	case "quit" :
		System.out.println("Program terminated");
		break;
	default:
		System.out.println("Enter a valid choice" );
		Calc();
		
		}
		sc.close();
	} 
}