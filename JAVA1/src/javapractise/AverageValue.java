package javapractise;

import java.util.Scanner;

public class AverageValue {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
	 
		
		System.out.println("Please enter the  number1" );
		int number1 = input.nextInt();
		System.out.println("You enetered the number is 1"  +number1);
				
	
	
System.out.println("Please enter the  number2");
int number2 = input.nextInt();
		System.out.println("You enetered the number1 is "  +number2);
		
		System.out.println("Please enter the  number3");
		int number3 = input.nextInt();
		System.out.println("You enetered the number1 is "  +number3);
		
		System.out.println("Average is -->"  +Average(number1, number2, number3) +"\n");
		
		
	}
	public static int Average (int number1 , int number2, int number3)
	
	{
		return (number1+number2+number3)/3;
	
	
	}

}
