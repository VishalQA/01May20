package test01;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the number ");
		Scanner input  = new Scanner (System.in);
		int number = input.nextInt();
		System.out.println(" You have enetered the number is  "  +number);
		
		
		int digit;
		int reversed = 0;
		
		for (; number != 0;  number /= 10) {
			digit = number % 10;
			reversed = reversed * 10 +digit;
			
			
		}
System.out.println("The reversed number is " +reversed);
	}

}
