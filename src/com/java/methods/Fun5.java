package com.java.methods;

public class Fun5 {

	static int Sample(int x)
	{
		int sq = x*x;
		return sq;
	}
	
	static float Addition(float x, int y)
	{
		return x+y;
	}
	
	public static void main(String[] args) 
	{
		int result = Sample(10);
		System.out.println("Square Value : " + result);
		
		float res = Addition(10.5f, 45);
		System.out.println("Add Value : " + res);
	}
}
