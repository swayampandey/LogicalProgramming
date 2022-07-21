package com.bridgelabz.LogicalProgramming;
import java.util.Scanner;

	public class StopWatch {
	/*
	 * stimulate stop watch java program
	 */
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;
	
	// method to start timer
	public void start()
	{
		startTimer=System.currentTimeMillis(); 		// returns the current time in milliseconds
		System.out.println("Start time is " +startTimer);
	}
	// method to stop timer
	public void stop() 
	{
		stopTimer=System.currentTimeMillis();
		System.out.println("Stop time is " +stopTimer);
	}
	// method for elapsed time
	public long getElapsedTime() 
	{
		elapsed=stopTimer-startTimer;
		return elapsed;
	}

	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Press 1 to start time ");
		sc.nextInt();
		sw.start();
		
		System.out.println();
		System.out.println(" Press 2 to stop time ");
		sc.nextInt();
		sw.stop();
		
		long l= sw.getElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:"+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
		sc.close();
			}
		

}
