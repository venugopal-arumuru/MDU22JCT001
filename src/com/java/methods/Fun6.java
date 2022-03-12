package com.java.methods;
import java.util.Scanner;
public class Fun6 {
	//Accept person age, then check is that person eligible or not for voting
	
	static void CheckAge(int age)
	{
		if(age>=18)
			System.out.println("Eligible for Voting");
		else
			System.out.println("Not Eligible for Voting");
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value ");
		int age = sc.nextInt();		
		CheckAge(age);
	}
}
