package javaeprogramming1;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the sentence ");
		String S = input.nextLine();
		System.out.println("You entered -->"  +S);
		
		
		
//		String Sentence = "Go Work";
		String Reversed = reverse(S);
		System.out.println("The reversed sentence is --->" +Reversed);

	}
	
	public static String reverse(String S) {
		
		if (S.isEmpty())
			return S;
		
		return reverse(S.substring(1))+ S.charAt(0);
	}

}
