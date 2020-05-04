package javapractise;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a sentence ");
		Scanner input = new Scanner(System.in);
		String sentense = input.nextLine();
		System.out.println("You entered " +sentense);
		
		String reversed = reveresed (sentense);
				System.out.println("Reversed sentense is "  +reversed);

	}
	public static String reveresed(String sentense) {
		if (sentense.isEmpty())
			return sentense;
		
		return reveresed(sentense.substring(1)) + sentense.charAt(0);
	}

}
