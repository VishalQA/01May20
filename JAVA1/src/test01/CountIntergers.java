package test01;

import java.util.Scanner;

public class CountIntergers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter a number");
		Scanner input  = new Scanner (System.in);
		int number = input.nextInt();
		System.out.println("Your entered number is " +number);
		
		int count = 0 ;
		for (; number != 0 ; number/= 10 , ++count) {
			
			System.out.println("Number of digits in the above number are " + count);
		}
		
	}

}
