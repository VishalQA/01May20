package javaprogramming1;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
 
	public static void main (String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the length of an array");
		int legth = s.nextInt();
		int []myarray = new int [legth];
		System.out.println("enter the elements of the array with the legth ----> " +legth);
		
		for (int i = 0; i <legth ; i++) {
			myarray[i] = s.nextInt();
		}
		
		System.out.println("yor arrays is ---->" +Arrays.toString(myarray));
	}
	
}
