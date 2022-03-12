package com.java.methods;
import java.util.Scanner;
public class Fun9 {

	//Accept set of values into an array then find sum of array values
	// using with arg and with return value
	
	static int ArraySum(int n[])
	{
		System.out.println("Array Values : ");
		int sum = 0;
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i] + "\t");
			sum = sum+n[i];
		}
				
		return sum;
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
		
		int res = ArraySum(x);
		System.out.println("\nSum of array values : " + res);
	}
}
