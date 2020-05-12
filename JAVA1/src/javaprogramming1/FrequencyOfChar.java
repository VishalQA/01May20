package javaprogramming1;

import java.util.Scanner;

public class FrequencyOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input   = new Scanner (System.in);
		System.out.println("Please enter a sentence");
		String s = input.nextLine();
		System.out.println("You have entered the sentence -->"  +s);
		System.out.println("Please enter a character to measure the frequency");
		char ch = input.next().charAt(0);
		System.out.println("You want to measure the frequency of --->" +ch);
		int frequency = 0;
		
		for (int i =0; i< s.length(); i ++) {
			if (ch == s.charAt(i)) {
				++frequency;
			}
		}
		
		System.out.println("Frequency of " +  ch  +  " is = "  +frequency);
		
		
	}

}
