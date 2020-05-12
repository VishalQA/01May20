package javaeprogramming1;

public class LargestinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numArray = {10.1,10.2,10.3,10.4};
		double largest = numArray[0];
		
		for (double num:numArray) {
			if (largest<num)
				largest = num;
			
		}
		System.out.println("Largest element ---> "  +largest);

	}

}
