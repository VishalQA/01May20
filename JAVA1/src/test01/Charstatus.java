package test01;

import java.util.Scanner;

public class Charstatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("PLease eneter a character");
		char ch = input.findInLine(".").charAt(0);
		System.out.println("Enetered character is " +ch);
		
		if ( ((ch >= 'a' ) && (ch <= 'z')) || ((ch >= 'A' ) && (ch <= 'Z')))  {
			System.out.println("Entered character is alphabet and the value is " +ch);
		}
		else {
			System.out.println("Entered character is not an alphabet and the value is " +ch);
			}

}
}