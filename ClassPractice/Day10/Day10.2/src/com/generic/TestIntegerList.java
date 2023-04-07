package com.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestIntegerList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);// empty list
		System.out.println("size " + list.size());// 0
		int[] ints = { 1, 3, 42, 39, 21, 89, 10, 10, 23, 34 };
		// populate the ArrayList with above values
		for (int i : ints) {
			list.add(i);
		}
		System.out.println("list with toString " + list);
		System.out.println("size " + list.size());// 0

		// check if element is present or absent: contains
		// finds first Occurrence of 34 and last occurrence
		System.out.println(
				list.contains(34) ? "the element exists in the array" : "the element doesnt exist in the array");
		System.out
				.println("First occurrence: " + list.indexOf(10) + " " + "second Occurrence: " + list.lastIndexOf(10));
		// remove element at 5 index
		System.out.println("Removed " + list.remove(5));
		System.out.println("list after removal" + list);
		System.out.println("\n List contents using for-each : implicit iterator");
		for (int i : list)//auto unboxing
			System.out.print(i + " ");

		System.out.println("\n List contents using for loop");
		for (int i=0;i<list.size();i++)//auto unboxing
			System.out.print(list.get(i)+" ");
		
		//1. attach an Iterator
		Iterator<Integer> itr = list.iterator();
		System.out.println("\n List contents using Iterator");
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		//sort the elements in asc order and display
		//API of collections class
		//public <T extends Comparable>? super T//void sort(List<T> list)
		Collections.sort(list);
		System.out.println("\n sorted list: ");
		for (int i : list)//auto unboxing
			System.out.print(i + " ");

	}
}