package com.string_builder;

public class TesteStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("hello");
		System.out.println(sb1);
		System.out.println(sb1.length()+" "+sb1.capacity()); //capacity is string length + 16 characters
		StringBuilder sb2= sb1.append("hi");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1==sb2);
				
	}
	

}
