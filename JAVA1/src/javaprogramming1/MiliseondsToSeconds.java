package javaprogramming1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MiliseondsToSeconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input  = new Scanner(System.in);
		System.out.println("Please enter the milisecond");
		long miliseconds = input.nextLong();
		System.out.println("You entered the miliseconds as --->"  + miliseconds);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(miliseconds);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(miliseconds);
		long microseconds = TimeUnit.MILLISECONDS.toMicros(miliseconds);
		long hours = TimeUnit.MILLISECONDS.toHours(miliseconds);
		
		System.out.format("%d miliseconds  = %d microseconds\n", miliseconds , microseconds);
		System.out.format("%d miliseconds = % d seconds \n", miliseconds , seconds);
		System.out.format("%d miliseconds = %d minutes\n", miliseconds ,minutes);
		System.out.format("%d miliseconds = %d hours\n", miliseconds , hours);
		
	}

}
