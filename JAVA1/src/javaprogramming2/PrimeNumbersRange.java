package javaprogramming2;

import java.util.Scanner;

public class PrimeNumbersRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter the  lowest number ");
		Scanner input1 = new Scanner(System.in);
		int lowestnumber = input1.nextInt();
		System.out.println("You eneterd lowest number as " +lowestnumber);
		
		System.out.println("Please enter the highest number ");
		Scanner input2 = new Scanner(System.in);
		int highestnumber = input2.nextInt();
		System.out.println("You enetered 2nd highest number as  " +highestnumber);
		
		boolean flag = false;
		int i ;	
		while (lowestnumber < highestnumber) {
				
			for ( i= 2 ; i <= lowestnumber/2 ; ++i ) {
				if (lowestnumber % i ==0) {
					flag = true;
					break;
					
				}
			}
			if (!flag) {
				System.out.print( lowestnumber +  "");
				++ lowestnumber;
				
			}
		}
		
}
}
