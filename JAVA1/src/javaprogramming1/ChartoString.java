package javaprogramming1;

import java.util.Scanner;

public class ChartoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the char value");
		char ch = input.next().charAt(0);
		int i = input.nextInt();
		double d = input.nextDouble();
		System.out.println("You enterd the character as --->" +ch);
		String st = Character.toString(ch);
		System.out.println("The string value of character "  +  ch +  "   is  ---->  " +  st);
	
		

	}

}
