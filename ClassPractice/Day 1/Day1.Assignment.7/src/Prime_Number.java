import java.util.Scanner;

public class Prime_Number {

			public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter start range:");
			int start= sc.nextInt();
			System.out.println("Enter the end point");
			int end= sc.nextInt();
			if (end < start) {
			System.out.println("Error");
		     		}
			for (int i = start; i < end+1; i++) {
			prime(i);
			sc.close();
			}

	}
static void prime(int n) {
	 int i,m=0,flag=0;      
	  m=n/2;      
	  if(n==0||n==1){  
	   System.out.println(n+" is not prime number");      
	  }else{  
	   for(i=2;i<=m;i++){      
	    if(n%i==0){      
	     System.out.println(n+" is not prime number");      
	     flag=1;      
	     break;      
	    }      
	   }      
	   if(flag==0)  { System.out.println(n+" is prime number"); }  
}
}
}
