package com.java.methods;

public class Fun1 {

	static void Sample()
	{
		System.out.println("This is user defined method");
	}
	
	static void Simple(int x, int y)
	{
		System.out.println("X value : " + x);
		System.out.println("Y value : " + y);
		System.out.println("Addition : " + (x+y));
	}	
	public static void main(String[] args) 
	{
		Sample();
		System.out.println("this is main method");
		Simple(10,20);
		System.out.println("-------------------");
		int p = 1000, q = 2000;
		Simple(p,q);
		System.out.println("End of main");
	}
}
