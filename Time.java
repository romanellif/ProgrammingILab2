import java.util.Scanner;

/*This program will convert the time entered in seconds to 
minutes*/ 

public class Time {
	public static void main(String[] args){

		Scanner input = new Scanner (System.in);
		
		System.out.println("\n");
		
		System.out.println("Enter your time in seconds");
		int seconds = input.nextInt();

		int time1 = seconds % 60; //seconds
		int time2 = seconds / 60; //hour
		int time3 = time2 % 60; //minutes
		time2 = time2 / 60;

		System.out.println( time2 + ":" + time3 + ":" + time1);
		System.out.println("\n");


	}
}