package javaprogramming2;

import java.util.Scanner;

public class NumberPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 Scanner input = new Scanner (System.in);
	 System.out.println("Please enter the number");
	 int n = input.nextInt();
	 System.out.println(" The entered number is " +n);
	 
	 if (n < 0) {
		 System.out.println("you have entered the negative number "  +n);
		 
	 }
	 else if (n >0 ){
		 System.out.println("you have entered the positive number "  +n);
	 }
	 
	 if (n == 0) {
		 System.out.println("You have entered number is zero");
	 }
		
	}

}
