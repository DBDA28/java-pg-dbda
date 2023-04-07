package com.no.strings.attached;

public class Test2 {
	public static void main(String[] args) {
	//testing equality of strings: Important
	String s1 = new String("hello");
	String s2 = new String(s1);
	String s3 = new String("Hello");
	System.out.println(s1==s2);//compares the references s1 and s2
	System.out.println(s1.equals(s2));//compares the actual contents strings in a case sensitive manner.
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s2.compareTo(s3));

	}//end of main
}//end of Test2
