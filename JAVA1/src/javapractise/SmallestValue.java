package javapractise;

import java.util.Scanner;

public class SmallestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("1. Please enter the value 1 ");
		int number1 = input.nextInt();
		System.out.println("1. You entered number1 --->" +number1);
		
		System.out.println("2. Please enter the value 2 ");
		int number2 = input.nextInt();
		System.out.println("2. You entered number1 --->" +number2);
		
		System.out.println("3. Please enter the value 3 ");
		int number3 = input.nextInt();		
		System.out.println("3. You entered number1 --->" +number3);
		
		System.out.println("Solution -->> The smallest value is ------->" +smallest(number1, number2, number3) + "\n");
		
		
	}

	public static int smallest(int number1, int number2, int number3 ) {
		return Math.min(Math.min(number1, number2), number3);
		
	}
}
