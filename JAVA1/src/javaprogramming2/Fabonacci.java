package javaprogramming2;

import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number ");
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		
		System.out.println("Your entered number is " +number);
		
		int i ;
		int t1 = 0 ;
		int t2 = 1;
		System.out.println("Fabonacci series of the number "  +number+  "  is as below");
		for (i = 1 ;  i <= number ; i ++) {
						
			System.out.print(t1 +  " + ");
						
			int sum = t1 + t2;
			t1 = t2 ;
			t2 = sum;
			
			
		}
		
		
	}

}
