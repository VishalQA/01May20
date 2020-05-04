package javapractise;

import java.util.Scanner;

public class GCDByRecusrion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter the two numbers");
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		System.out.println(" You entered the two numbers are " +number1+  "  andd  " +number2);
		
		int hcf = hcf(number1, number2);
		System.out.println("hcf of the two numbers is "  +hcf);
	}
public static int hcf(int number1, int number2) {
	
	if (number2 != 0)
		return hcf (number2 , number1%number2);
				
		else 
			return number1;
}
	
}
