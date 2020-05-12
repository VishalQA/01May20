package javaprogramming2;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter the number ");
		Scanner input  = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("Your entered number is "  +number);
		int i ;
		
		for (i = 1; i <= 10 ; i++) {
			int multiplication = i * number ;
			
			System.out.printf(" %d * %d = %d \n" , number , i , multiplication );
		}
		
		
	}

}
