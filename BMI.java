import java.util.Scanner;

/*This program will calculate your BMI by asking you for your
weight in pounds and your height in feet. Then it will
convert those values to kilograms(weight) and meters(height) and then 
calculate your BMI */ 

public class BMI {
    public static void main(String[] args) {

	    Scanner input = new Scanner (System.in);
	    
	    System.out.println("\n");
	    
	    System.out.println("What is your weight in pounds?");
	    double pounds = input.nextDouble();
	    
	    System.out.println("What is your height in feet?(input your height as in decimals)");
	    double feet = input.nextDouble();

	    double kilos = pounds * 0.453592;
	    double meters = feet * 0.3048;
	    double bmi = kilos / (meters*meters);

	    System.out.println("Your BMI is equal to = " + bmi);

	    System.out.println("\n");
    }
}