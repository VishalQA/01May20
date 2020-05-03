package test01;

import java.util.Scanner;

public class PlindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a number");
		int number = input.nextInt();
		System.out.println("The number entered is = "  +number);
		
		int originalnumber = number ;
		int reversednumber =0;
		int remainder;
		
		while ( number != 0 ) {
			
			remainder = number % 10;
			reversednumber = reversednumber * 10 + remainder;
			number /= 10;			
			
			
			
		}
		
		if (originalnumber == reversednumber ) {
			System.out.println(originalnumber  +  "is a Palindrome number");
					}
		else 
		{
			System.out.println(originalnumber  +  "is a not a Palindrome number");
		}
	}

}
