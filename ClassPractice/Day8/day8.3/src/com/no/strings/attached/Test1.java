package com.no.strings.attached;

public class Test1 {
	public static void main(String[] args) {
		// checking immutability of strings.
		String s = new String("hello");
		String s1 = s.concat("hi");
		System.out.println(s);
		System.out.println(s1);
		s += "1234";
		System.out.println(s);
		String s2 = s.toUpperCase();
		System.out.println(s2);
		// use substring
		System.out.println(s2.substring(5));
//	String s3 = "Hello1234".substring(5);
//	System.out.println(s3);
		String s3 = "Hello1234you".substring(5, 9);
		System.out.println("s3 " + s3);
		// Display YES if s2 contains the substring 123: String searching the api
		System.out.println(s2.contains(s3) ? "Yes" : "No");
		System.out.println(s2.charAt(0) + "" + s2.charAt(s2.length() - 1));
		String ss = "Tryign out string api with some string";
		System.out.println(ss.indexOf("string") + " " + ss.lastIndexOf("strings"));

	}
}
