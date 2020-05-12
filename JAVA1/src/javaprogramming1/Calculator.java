package javaprogramming1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Please enter two numbers ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        
        System.out.printf("You have entered two numbers as ");
        System.out.println("Please enter an op ( + , - , * , / ) : ");
        
        char op = input.next().charAt(0);
        
        double result;
        
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
        	System.out.println("Error! operator you entered is not from the list");
        	return;
        	                 
        }
        System.out.println("The result is :" +number1+  op  +number2+ "=" +result  );
       
        
	}

}
