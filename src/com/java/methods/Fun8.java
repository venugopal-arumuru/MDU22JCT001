package com.java.methods;
import java.util.Scanner;
public class Fun8 {

	//Accept set of values into an array then find sum of array values
	// using with arg and without return value
	
	static void ArraySum(int n[])
	{
		System.out.println("Array Values : ");
		int sum = 0;
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i] + "\t");
			sum = sum+n[i];
		}
		
		System.out.println("\nSum of array values : " + sum);
	}	
	
	public static void main(String[] args) 
	{
		int x[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 values ");
		for(int i=0;i<x.length;i++)
		{
			x[i] = sc.nextInt();
		}
		
		ArraySum(x);
	}
}
