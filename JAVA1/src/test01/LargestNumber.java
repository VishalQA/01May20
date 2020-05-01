package test01;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner n1 = new Scanner (System.in);
		System.out.println("Please enter number n1 ");
		int number1 = n1.nextInt();
		System.out.println("Please enter number is " +number1);
		
		Scanner n2 = new Scanner (System.in);
		System.out.println("Please enter number n2 ");
		int number2 = n2.nextInt();
		System.out.println("The number entered is " +number2);
		
	
		
		Scanner n3 = new Scanner (System.in);
		System.out.println("Please enter number n3  ");
		int number3 = n3.nextInt();
		System.out.println("The number entered is " +number3);
		
		
		
//		int n1 = 100;
//		int n2 = 200;
//		int n3 = 300;
		
		if (number1 >= number2 && number1>=number3) {
			System.out.println("Largest number is " +number1);
		}
 		else if (number2 >= number1 && number2 >= number3) {
			System.out.println("Largest number is " +number2);
			
			}
		else {
			System.out.println("Largest nuber is " +number3);
		}

	}

}
