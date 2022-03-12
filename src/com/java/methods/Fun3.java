package com.java.methods;
import java.util.Scanner;
public class Fun3 {
	// accept a number then check is it even or odd
	// using user defined method with arguments
	static void EvenOrOdd(int n)
	{
		if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value : ");
		int x = sc.nextInt();		
		EvenOrOdd(x);
	}

}
