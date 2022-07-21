package com.bridgelabz.LogicalProgramming;
import java.util.Scanner;

public class FibonacciSeries {
	/*
	 * java program to print fibonacci series 
	 */

	public static void main(String[] args) {
		/*
		 * taking user input by using scanner class
		 */
		int firstTerm=0, secondTerm=1;
		System.out.println("Enter the term till you want to print fibonacci seires");
		Scanner sc = new Scanner(System.in);
		int term = sc.nextInt();
		System.out.println("fibonacci series til "+term+" is ");
		System.out.println("*********************************");
		for(int i=1; i<=term; i++) {
			System.out.print(firstTerm+ "  ");
			/*
			 * computation of next term
			 */
			int nextTerm= firstTerm + secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
				
		}
		sc.close();
	}
}