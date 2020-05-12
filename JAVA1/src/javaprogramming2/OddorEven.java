package javaprogramming2;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the number ");
		Scanner entervalue = new Scanner (System.in);
		int value = entervalue.nextInt();
		
		System.out.println("The entered value is " +value);
		
		if (value % 2 == 0 ) {
			System.out.println("The numbe is even");
		}
		else {
			System.out.println("The number is odd");
		}
		
		

	}

}
