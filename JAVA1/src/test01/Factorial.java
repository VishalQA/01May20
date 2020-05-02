package test01;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the number ");
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		
		System.out.println("You enetred the number is " +number);
		
		
		
		int i ;
		long factorial = 1;
		
		
  
		
		for ( i =1 ; i<= number; i ++ ) {
			factorial = i * factorial;
			
			
		}
		System.out.println("The factorial of the eneted number is "  +factorial);
				
	}

}
