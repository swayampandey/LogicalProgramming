package com.bridgelabz.LogicalProgramming;
import java.util.Scanner;

public class TemperatureConversion {
	/*
	 *  java program for temperature conversion
	 *  creating a static method TempConversion
	 *  taking user input of temperature in fahrenheit & celsius by using scanner class 
	 *  storing the temperature in double data type
	 */
	
	public static void TempConversion()
	{
		System.out.println("Enter the temperature in fahrenheit");
		
		Scanner sc = new Scanner(System.in);
		double TempF= sc.nextDouble();
		double Celsius= (TempF-32)* 5/9; 		// Temp conversion formula
		System.out.println("Temperature in celsius is "+Celsius);
		System.out.println();
		
		System.out.println("Enter the temperature in celsius");
		double TempC= sc.nextDouble();
		double Fahrenheit= (TempC*9/5) + 32;	// Temp conversion formula
		System.out.println("Temperature in fahrenheit is "+Fahrenheit);
		sc.close();
	}
	
	

	public static void main(String[] args) {
		/*
		 * calling static method TempConversion() in main method
		 */
	TempConversion();
	
	}

}
