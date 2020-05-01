package test01;

import java.util.Scanner;

public class OddEvenByTernaryOp {
	
	public static void main(String[]args) {
		
		
		System.out.println("please enter a number");
		
		Scanner entervalue1 = new Scanner (System.in);
		int value1 = entervalue1.nextInt();
		
		System.out.println("The entered value is " +value1);
		
		String OddEven = (value1 % 2 == 0 ) ? "even" :"odd";
		
		System.out.println(value1+ "  is  " +OddEven);	
		
		
		
		
		
	}

}
