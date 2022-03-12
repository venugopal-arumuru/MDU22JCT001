package com.java.methods;
import java.util.Scanner;
public class Fun2 {
	// accept a number then print its square and cube of that number
	// using user defined method with arguments
	static void SquareAndCube(int n)
	{
		int sq = n*n;
		System.out.println(n + " square value " + sq);
		int cb = sq*n;
		System.out.println(n + " cube value " + cb);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value : ");
		int x = sc.nextInt();		
		SquareAndCube(x);
	}

}
