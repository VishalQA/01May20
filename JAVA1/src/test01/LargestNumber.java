package test01;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 100;
		int n2 = 200;
		int n3 = 300;
		
		if (n1 >= n2 && n1>=n3) {
			System.out.println("Largest number is " +n1);
		}
 		else if (n2 >= n1 && n2 >= n3) {
			System.out.println("Largest number is " +n2);
			
			}
		else {
			System.out.println("Largest nuber is " +n3);
		}

	}

}
