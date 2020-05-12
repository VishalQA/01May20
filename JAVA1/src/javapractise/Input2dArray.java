package javapractise;

import java.util.Scanner;

public class Input2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the no of matrix rows");
		
		int matrixrows  = scan.nextInt();
		
		System.out.println(" Enter the no of matrix columns");
		
		int matrixcolumns  = scan.nextInt();
		
		int[][] matrix = new int[matrixrows][matrixcolumns];
		
		//Method to enter data
		
		entermatrixdata(scan , matrix, matrixrows , matrixcolumns);
		
		//Method to print matrix data
		
		printmatrix (matrix , matrixrows , matrixcolumns);
	}
		
		public static void entermatrixdata (Scanner scan , int[][] matrix , int matrixrows , int matrixcolumns) {
			System.out.println("Enter the matrix data");
			for (int i = 0; i < matrixrows; i ++) {
				for (int j = 0; j <matrixcolumns; j++) {
					matrix[i][j] = scan.nextInt();
					
				}
			}
		}
			
			public static void printmatrix (int [][] matrix , int matrixrows, int matrixcolumns) {
				System.out.println("Your matrix is as belwo - ");
				for (int i = 0; i < matrixrows; i ++) {
					for (int j = 0; j <matrixcolumns; j++) {
						System.out.print(matrix [i][j]+"\t");
						
					}
					System.out.println();
				}
			}
			
}

		
		


