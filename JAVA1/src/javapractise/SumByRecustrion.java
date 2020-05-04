package javapractise;

import java.util.Scanner;

public class SumByRecustrion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Please enter the number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("You entered the number " +number);
		
		int sum = addnumbers(number);
		System.out.println("sum = " +sum);
		
	}

	public static int addnumbers(int number){
		if (number != 0 )
			return number + addnumbers(number -1 );
		else 
			return number;
		
		
	}

		
		
		}

