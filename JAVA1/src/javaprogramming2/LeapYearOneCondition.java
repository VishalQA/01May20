package javaprogramming2;
import java.util.Scanner;
public class LeapYearOneCondition {

	public static void main (String[]args) {
	
		
		
		Scanner value = new Scanner(System.in);
			System.out.println("Please enter year");
		int year = value.nextInt();
		
		System.out.println("Entered year is " +year);
		if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 ==0 ) ) {
			System.out.println(year +  "  is a leap year");
		}
			else {
				System.out.println(year +  "  is not a leap year");
			}
		}
	}
