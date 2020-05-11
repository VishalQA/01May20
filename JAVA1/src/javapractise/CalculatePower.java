package javapractise;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the base ");
		int base = input.nextInt();
		System.out.println("You Entered --->"  +base);
		System.out.println("Please enter the powerraised");
		int powerraised = input.nextInt();
		System.out.println("you entered the power --->" +powerraised );
		
		
		int result = power(base , powerraised );
		
		System.out.printf("%d ^ %d  = %d ", base , powerraised , result);
		
	}
	public static int power (int base , int powerraised) {
		if (powerraised != 0)
			return (base * power(base , powerraised - 1));
		else 
			return 1;
		
		
		
	}

}
