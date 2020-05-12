package javaprogramming2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a number");
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		System.out.println(" You enter the number " +number);
		boolean flag = false;
		int i ;
		
		for (i = 2 ; i <= number/2 ; i ++) {
			
			if (number % i == 0) {
				
				flag = true;
				break;
			}
		}

		if ( !flag) {
			System.out.println("the number is prime number ");
		}
		else {
			System.out.println(" The number is not a prime number");
		}
	}

}
