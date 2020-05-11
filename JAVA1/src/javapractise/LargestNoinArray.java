package javapractise;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNoinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the length of an array");
		int legth = s.nextInt();
		int []myarray = new int [legth];
		System.out.println("enter the elements of the array & the leght of the array should be " +legth);
		int i = 0;
		int largest = myarray[i];
		
	
		
		for ( i = 0; i <legth ; i++) {
			myarray[i] = s.nextInt();
		}
			
			System.out.println("yor arrays is ---->" +Arrays.toString(myarray));
			
			for (int num : myarray) {
				
				if (largest < num)
					largest = num;
			}
			
			System.out.println(" Largest : largest element from entered array is ---> " +largest);

			int k = 1;
	int smallest = myarray[k];
	for (int num : myarray) {
		
		if ( smallest > num)
			smallest = num;
			
	
	
	System.out.println(" Smallest : smallest element from entered array is ---> " +smallest);
		
	}

	}
}

		
	
	
	
	
	
	

