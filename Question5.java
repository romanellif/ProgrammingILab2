import java.util.*;

/* This program will prompt the user to enter their name as 
(lastname, firstname) and thye program will output their name as 
(firstname, lastname)*/

public class Question5 {
	public static void main(String[] args){

		Scanner input = new Scanner (System.in);

		System.out.println("\n");

		System.out.println("\nEnter your name as followed: lastname, firstname");
		String firstFormat = input.nextLine();

		int indexComma = firstFormat.indexOf(',');

		System.out.printf("%nYou have inserted '%s'",firstFormat);
		System.out.printf("%nIndex of comma is %d",indexComma);

		String last = firstFormat.substring(0,indexComma);
		last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

		String first = firstFormat.substring(indexComma+2);
		first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();

		System.out.printf("%nFirst name is %s ", first);
		System.out.printf("%nLast name is %s ", last);

		System.out.printf("%nThe Final format is %s %s ", first, last);

		System.out.println("\n");
	}
}