package test01;

import java.util.Scanner;

public class Quotient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Please enter the dividend ");
		int dividend = input1.nextInt();
		
		System.out.println("The dividend is "  +dividend);
		
		System.out.println("Please enter the diviser");
		
		int diviser = input2.nextInt();
		
		System.out.println("The diviser is " +diviser);
		
		int quotient = dividend / diviser;
		int remainder = dividend % diviser;
		
		System.out.println("The quotient of the dividend and diviser is " +quotient);
		System.out.println("The remainder of the dividend and diviser is " +remainder);
		
		
		
	
	}

}
