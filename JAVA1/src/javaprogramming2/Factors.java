package javaprogramming2;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Please enter the number ");
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		System.out.println("You have entered the number " + number);
		System.out.println("Below are the factors of the entered number " +number );
		for (int i = 1 ; i <= number ; i ++) {
			
			if (number % i  == 0 ){
				
				System.out.println( i + "");
			}
			
		}
	}

}
