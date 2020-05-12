package javaeprogramming1;

import java.util.Scanner;

public class Calc {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Please enter two numbers ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        
        System.out.printf("You have entered two numbers as ");
        System.out.println("Please enter an op : + , - , * , /");
        
        char op = input.findInLine(".").charAt(0);
        
        int result;
        
        switch(op) {
        case '+' :
        result = number1 +number2 ;
        break;
        
        case '-':
        	result = number1 - number2 ;
        	break;
        case '*' :
        	result = number1 * number2;
        	break;        	
        case '/':
            result = number1/number2;
            break;
        default :
        	System.out.println("Error! operator is not from the list");
        	return;
        	                 
        }
        System.out.printf("%.1f %c %.1f = %.1f", number1, op, number2, result );
        
	}

}
