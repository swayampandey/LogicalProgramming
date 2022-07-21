package com.bridgelabz.LogicalProgramming;
import java.util.Scanner;

public class PrimeNumber {
	/*
	 * java program to find prime number.
	 */

	public static void main(String[] args) {
		int count=0;
		/*
		 * taking user input by using scanner class
		 * storing entered number in num variable
		 */
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=num;i++ ) {
			if(num%i==0) {
				count++;
			}
		}
		if(count == 2)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
		sc.close();

	}

}
