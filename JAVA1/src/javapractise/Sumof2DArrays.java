package javapractise;

import java.util.Scanner;

public class Sumof2DArrays {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			
			Scanner scan = new Scanner (System.in);
			System.out.println("Please ener the number of matrix you want to enter ");
			int d = scan.nextInt();
			
			System.out.println("You want the number of matrix as --->" +d);
			
			for( int z = 1; z <= d ; z++) {
				
			System.out.println("Enter the no of matrix1 rows");
			
			int matrixrows1  = scan.nextInt();
			
			System.out.println(" Enter the no of matrix1 columns");
			
			int matrixcolumns1  = scan.nextInt();
			
			int[][] matrix1 = new int[matrixrows1][matrixcolumns1];
			int[][] c  = new int [matrixrows1][matrixcolumns1];
			
			//Method to enter data
			
			entermatrixdata(scan , matrix1, matrixrows1 , matrixcolumns1);
			
			//Method to print matrix data
			
			printmatrix (matrix1 , matrixrows1 , matrixcolumns1);
				}
		}
			
			public static void entermatrixdata (Scanner scan , int[][] matrix1 , int matrixrows1 , int matrixcolumns1) {
				System.out.println("Enter the matrix data");
				for (int i = 0; i < matrixrows1; i ++) {
					for (int j = 0; j <matrixcolumns1; j++) {
						matrix1[i][j] = scan.nextInt();
						
					}
				}
			}
		
				
				public static void printmatrix (int [][] matrix , int matrixrows1, int matrixcolumns1) {
					
					System.out.println("Your matrix is as belwo - ");
					for (int i = 0; i < matrixrows1; i ++) {
						for (int j = 0; j <matrixcolumns1; j++) {
							System.out.print(matrix [i][j]+"\t");
							
						}
						System.out.println();
					}
//					
//				for (int i = 0; i <matrixrows1; i++) {
//					for (int j = 0; j <matrixcolumns1 ; j++) {
//						  int[][] c;
//						c[i][j] =  matrix [i][j];
//					}
//				}
//				}
//				
//				  System.out.println ("Final Matrix");
//			        for (int i=0; i<matrixrow1; i++) {
//			            int matrixcolumns1;
//						for(int j=0; j<matrixcolumns1; j++){
//			                System.out.print(c[i][j] + "\t");
//			            }
//			            System.out.print("\n"); 
//			        }
				
}

		}

