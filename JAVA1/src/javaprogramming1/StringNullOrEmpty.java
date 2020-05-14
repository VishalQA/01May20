package javaprogramming1;

import java.util.Scanner;

public class StringNullOrEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a string");
		String s = input.nextLine();
		System.out.println("You enterd the string as --->"  +s);
		
		if (NullorEmpty(s))
			System.out.println("string is null or empty");
		else 
			System.out.println("string is not null or empty");
		
	}
	public static boolean NullorEmpty(String str) {
//		if (str != null && !str.trim().isEmpty())
			if (str != null && str.isEmpty())
			return false;
		return true;
		
		
	}

}
