package javapractise;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  input = new Scanner (System.in);
		System.out.println("Please enter a sentense");
		String s = input.nextLine();
		System.out.println("You entered the sentence as ---> "   +  s);
		
		s = s.replaceAll("\\S", "");
		System.out.println("After removing white spaces"  +  s);
		

	}

}
