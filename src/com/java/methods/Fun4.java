package com.java.methods;
import java.util.Scanner;
public class Fun4 {
	// accept a two numbers then find which is big
	// using user defined method with arguments
	static void Big(int n, int m)
	{
		if(n>m)
			System.out.println("First No is Big");
		else
			System.out.println("Second No is Big");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any  two values : ");
		int x = sc.nextInt();
		int y = sc.nextInt();		
		Big(x, y);
	}

}
