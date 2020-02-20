import java.util.Scanner;

/* This program will ask the user for the temperature in Celsius 
in the past 3 days and it will deliver the average of those 3 days*/

public class Question4 {
	public static void main(String[] args){

		Scanner input = new Scanner (System.in);

		System.out.println("\n");
		
		System.out.println("What was the temperature of the first day?");
		Double firstDay = input.nextDouble();

		System.out.println("What was the temperature of the second day?");
		Double secondDay = input.nextDouble();

		System.out.println("What was the temperature of the third day?");
		Double thirdDay = input.nextDouble();

		double average = (firstDay + secondDay + thirdDay) / 3;

		System.out.println("The average temperature of the past 3 days has been "
							+ String.format("%.2f",average) + " Celsius.");

	}
}