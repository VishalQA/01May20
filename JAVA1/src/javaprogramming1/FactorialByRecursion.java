package javaprogramming1;

import java.util.Scanner;

public class FactorialByRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("You entered " +number);
		
		long factorial = multiplynumber(number);
		System.out.println(" Factorial of "  +  number  +  "  is  " +  factorial);
		

	}

	public static long multiplynumber(int number) {
		
		if (number >= 1) {
			
			return number * multiplynumber(number-1);
		}
			else 
				return 1;
		}
		
	}

