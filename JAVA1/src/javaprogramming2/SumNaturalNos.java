package javaprogramming2;

import java.util.Scanner;

public class SumNaturalNos {
	public static void main(String[]args) {
//		int num = 100; 
		
		System.out.println("Please enter a number ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("Enetred number is " +number);
		
		
		
		
		int sum = 0;
		int i;
		
		
		for (i = 1; i <= number; i++) {
			
			sum = sum +i ;
			
		}
	System.out.println("natural sum for the number from 1 to  " +number+   " is "   +sum);
	}

}
