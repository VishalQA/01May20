package javaprogramming1;

import java.util.Arrays;
import java.util.Scanner;

public class NumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.println("Please eneter the legth of an array");
		int length = input.nextInt();
		int [] arrayone = new int[length];
		System.out.println("Please enter the elements of array with the legth as --->"  +length);
		
		for(int i = 0 ; i <length; i++) {
		     arrayone [i] = input.nextInt();
			
		}
		
		System.out.println("your array is ---> "   +Arrays.toString(arrayone));
		
		System.out.println("Please enter a number to find the above array");
		int findnumber = input.nextInt();
		System.out.println("You want to find the number -->"  +findnumber);
		
		boolean found = false;
		
		for (int n :arrayone) {
			if (n == findnumber) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println( findnumber +  " is found");
			}
			else 
				System.out.println( findnumber + " is not found");
		}
	}
		
	


