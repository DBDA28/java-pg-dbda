package com.p1;

public interface Printer {
	int SPEED=500; //javac adds public static final keywords to the data members implicitly
	void print(String msg);//javac adds public abstract keywords to the methods of the interface
}//end of Printer interface
