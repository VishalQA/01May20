package javaprogramming2;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the character");
		char ch = input.findInLine(".").charAt(0);
		System.out.println("The enteres character is " +ch );
		
		
		
		
		
//char ch = 'o';
//
// 
//
//
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
	System.out.println("The char is vowel");
}
else {
	System.out.println("The char is consonant");
}
		
	}
	}

