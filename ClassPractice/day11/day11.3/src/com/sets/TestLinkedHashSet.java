package com.sets;

import java.util.HashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		String[] names = {"Meera", "Mahesh", "Sameer", "Samantha", "Riya", "Keerti","Meera","Shubham","Anish","Sameer"};
		
		//create empty HashSet and populate names
		HashSet<String> stringSet=new HashSet<>();
		for(String s:names)
			System.out.println("Added"+stringSet.add(s));
		//display HashSet
		System.out.println("size"+stringSet.size());
		System.out.println("HashSet contains");
		for(String s: stringSet)
			System.out.println(s);

	}//end of main

}//
