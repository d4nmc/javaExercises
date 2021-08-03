package calculator;

import java.util.Scanner;

public class ScanCalc {

	

	    public static void main(String[] args)
	    {
	        // two number sums
	        double num1, num2;
	  
	        // installed scanner and created sc
	        Scanner sc = new Scanner(System.in);
	  
	        System.out.println("Enter the numbers");
	  
	        // using the scanner in console for inputs - sc = new instance of scanner in this class/method
	        
	        num1 = sc.nextDouble();
	  
	        num2 = sc.nextDouble();
	  
	        System.out.println("(add / subtract / multiply /divide)");
	  
	        char operator = sc.next().charAt(0);
	  
	        double answer = 0;
	  
	        switch (operator) {
	  
	        // ADD
	        case '+':
	  
	            answer = num1 + num2;
	  
	            break;
	  
	        // SUBTRACT
	        case '-':
	  
	            answer = num1 - num2;
	  
	            break;
	  
	        // MULTIPLY
	        case '*':
	  
	            answer = num1 * num2;
	  
	            break;
	  
	        // DIVIDE
	        case '/':
	  
	            answer = num1 / num2;
	  
	            break;
	  
	        // DEFAULT FOR INCORRECT INPUT
	        default:
	  
	            System.out.println("That ain't gonna work buddy, try again");
	  
	            break;
	        }
	  
	        System.out.println("Answer =");
	  
	        System.out.println();
	  
	        // FORMATTING FOR OUTPUT
	        System.out.println(num1 + " " + operator + " " + num2
	                           + " = " + answer);
	    }
	}
	

