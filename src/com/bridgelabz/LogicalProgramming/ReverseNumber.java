package com.bridgelabz.LogicalProgramming;
import java.util.Scanner;

public class ReverseNumber {
	/*
	 * java program to reverse a number
	 */

	public static void main(String[] args) {
		int rev=0;
		/*
		 * taking user input by using scanner class
		 * storing entered number in num variable
		 */
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		
		while(num>0) {
			int rem=num%10;
			rev= rev*10+rem;
			num=num/10;
		}
		System.out.println("The reverse of the given number is "+rev);
		sc.close();
	}

}
