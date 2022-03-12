package com.java.methods;
import java.util.Scanner;
public class Fun7 {

	//Accept a number then find factorial value
	// using with arg and with return value
	
	static   int  Factorial(int n)
	{		
		int fa = 1;
		while(n>0)
		{
			fa = fa*n;
			n--;
		}
		
		return fa;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value");
		int x = sc.nextInt();
		int result =  Factorial(x);
		System.out.println("Factorial Value of " + x + " is : " + result);
	}
}
