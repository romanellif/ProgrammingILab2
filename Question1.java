import java.util.Scanner;

/* This program will prompt the user to input date based on the question.
It is a modification of Lab 1 Questions except the user will be able to enter
their own variables this time.*/

public class Question1 {
	public static void main(String[] args) {

	Scanner input = new Scanner (System.in);

	//Code for what's my age?//

	System.out.println("\n");

	System.out.println("What is your year of birth?");
	int yearOfBirth = input.nextInt();

	int currentYear = 2020;
	int age = currentYear - yearOfBirth;

	System.out.println("Your current age is " + age);

	System.out.println("\n");

	//Code for Converting money//

	System.out.println("\n");

	System.out.println("How much money are you converting from cad?");
	double cad = input.nextDouble();

	double eur = (cad * 0.68);
	double usd = (cad * 0.75);

	System.out.println("You currently have " + cad + " Canadian dollars.");
	System.out.println("When converted to American dollars, you will have " + usd + ".");
	System.out.println("When converted to euros, you will have " + eur + ".");

	System.out.println("\n");

	//Code for calculating perimeter and Area//

	System.out.println("\n");

	System.out.println("What is the width of the rectangle in centimeters?");
	double width = input.nextDouble();

	System.out.println("What is the lenght of the rectangle in centimeters?");
	double lenght = input.nextDouble();

	System.out.println("\n");

	double perimeter = (lenght * 2) + (width * 2);
	double area = lenght * width;

	System.out.println("The width you entered was " + width);
	System.out.println("The lenght you entered was " + lenght);

	System.out.println("The perimeter of the rectangle is equal to " + perimeter + " centimeters.");
	System.out.println("The area of the rectangle is equal to " + area + " centimeters squared.");

	System.out.println("\n");

	}

}