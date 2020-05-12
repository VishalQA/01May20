package javaprogramming2;

import java.util.Scanner;

public class EnterNumber {
	public static void main (String[]args) {
		
		System.out.println("Hi , Please enter a number");
		Scanner inputnumber = new Scanner (System.in);
		int numberis =  inputnumber.nextInt();
		
		System.out.println("Your enetered number is " +numberis);
		
		
	}

}
