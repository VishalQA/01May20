package javapractise;

import java.util.Scanner;

public class RoundNumbertoDecimalPlaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a decimal number");
		double number = input.nextDouble();
		System.out.println("You entered  "  +number);
		System.out.println("The rounded number upto 2 decimal point is as below --->>");
		System.out.format(" %.2f" , number);

	}

}
