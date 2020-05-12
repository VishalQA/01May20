package javaprogramming1;

import java.util.Scanner;

public class AverageofArray {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0 ;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter no. of elements you want in an aarray");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Hi Please enter all elements below --->");
	
		for (int i = 0;i < n ; i++ )
		{
			a[i] = s.nextInt();
			sum = sum +a[i];
		}
			System.out.println(" sum is --> " +sum);
			
			int average = sum/n;
			
			System.out.println("The average is --->" +average);
		
		
//		double[] numArray = {10.5 , 11.5, 12.5 , 13.5 };
//		double sum = 0;
//		
//		for (double num: numArray) {
//			sum += num;
//			
//		}
//
//		int  average = (int) (sum /  n);
//		
//		System.out.println("Average is -->" +average);
		
	}

}
