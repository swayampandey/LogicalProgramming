package com.bridgelabz.LogicalProgramming;
import java.util.Scanner;

public class PerfectNumber {
	/*
	 * Java program to find perfect number
	 */

		public static void main(String[] args) {
		int sum=0;
		/*
		 * taking user input using scanner class
		 */
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			
			if(num%i==0) {
			sum=sum+i;	
			
			}
	}
			if (num == sum) 
			System.out.println("Perfect Number");
			else
			System.out.println("Not a perfect Number");
		
	}
	
	}


