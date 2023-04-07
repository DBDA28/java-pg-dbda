package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyTextFile {

	public static void main(String[] args) {
		System.out.println("Enter src file name n dest file name on separate lines");
		try(Scanner sc=new Scanner(System.in);
				//Java App <---- BR <---- FR <--- src file
				BufferedReader br=new BufferedReader(new FileReader(sc.nextLine()));
				//Java App ---> PW ----> FW ---> dest text file
				PrintWriter pw=new PrintWriter(new FileWriter(sc.nextLine(),true))
				)
		{
			br.lines() //Stream<String>
			.forEach(pw::println);//s -> pw.println(s)
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
