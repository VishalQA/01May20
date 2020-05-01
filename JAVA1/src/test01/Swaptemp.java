package test01;

public class Swaptemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float first = 11f;
		float second = 22f;
		
		System.out.println("Before swap , first number is " +first);
		System.out.println("Before swap , second number is " +second );
		
		float temporary = first;
		first = second;
		second = temporary;
		
		System.out.println("After swap , first number is " +first);
		System.out.println("After swap , second number is " +second );
		
		
		
				

	}

}
