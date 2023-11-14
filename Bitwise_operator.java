package Operator;
import java.util.Scanner;

public class Bitwise_operator
{

	public static void main(String[] args) 
	{
		int num1,num2,result;
		Scanner s = new Scanner(System.in);    		// Take input from he user
		System.out.println("Enter First Number: ");
		num1 = s.nextInt();
				
		System.out.println("Enter Second Number: ");
		num2 = s.nextInt();
				
		//Bitwise Operations
				
		result = (num1 & num2);
		System.out.println("The result of (num1&num2) is: " + result);     

		result = (num1 | num2);
		System.out.println("The result of (num1|num2) is: " + result);
				
		result = (num1 ^ num2);
		System.out.println("The result of (num1^num2) is: " + result);

	}

}
