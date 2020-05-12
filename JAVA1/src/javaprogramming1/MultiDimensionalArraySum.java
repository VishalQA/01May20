package javaprogramming1;

public class MultiDimensionalArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rows =2;
        int columns =3;
        int [][] firstmatrix = {{2,3,4},{5,2,3}};
        int [][] secondmatrix = {{-4,5,3},{5,6,3}};
        
        int[][] sum = new int[rows][columns];
        for (int i=0; i < rows; i ++) {
        	for (int j = 0; j <columns; j++) {
        		sum[i][j] = firstmatrix[i][j] + secondmatrix [i][j];
        	}
        }
        System.out.println("sum of two matrix is ");
        for (int[] row:sum) {
        	for (int column :row) {
        		System.out.print(column + "    ");
        	}
        System.out.println();
        }
        
        
	}

}
