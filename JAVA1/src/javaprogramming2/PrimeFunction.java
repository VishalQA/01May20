package javaprogramming2;

import java.util.Scanner;

public class PrimeFunction {

	public static void main(String[] args) {

		System.out.println("Please enter the  lowest number ");
		Scanner inputA = new Scanner(System.in);
		int lownumber = inputA.nextInt();
		System.out.println("You eneterd lowest number as " +lownumber);
		
		System.out.println("Please enter the highest number ");
		Scanner inputB = new Scanner(System.in);
		int highnumber = inputB.nextInt();
		System.out.println("You enetered 2nd highest number as  " +highnumber);
		
		
		
       while (lownumber < highnumber) {
    	   if (checkprimenumber(lownumber))
    		   
    		   System.out.println( "This is a prime number between the range  " + lownumber );
    	   
    	   ++lownumber;
    	   
    		   
    	   
       }
       
	}
	public static boolean checkprimenumber(int num) {
		boolean flag = true;
			
		for (int i = 2; i <= num/2; i ++) {
			
			if (num % i == 0) {
				flag = false;
				break;
				
			}
			
		}
		return flag;
	}

}
