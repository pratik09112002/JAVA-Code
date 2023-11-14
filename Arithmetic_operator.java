package Operator;

import java.util.Scanner;

public class Arithmetic_operator {

	public static void main(String[] args) 
	{
		int a,b,c;
	 	Scanner s = new Scanner(System.in);
		System.out.println("Enter a First number: ");
         	a=s.nextInt();

		System.out.println("Enter a Second number: ");
		b=s.nextInt();

		c=a+b;										// For Addition
		System.out.println("Addition is: " + c);				
		c=a-b;										// For Subtraction
		System.out.println("Subtraction is: "+ c);
		c=a*b;										// For Mutiplication
		System.out.println("Multiplication is: "+ c);
		c=a/b;										// For Division
		System.out.println("Division is: "+ c);
		c=a%b;										// For Modulus
		System.out.println("Modulus is: "+ c);

	}

}
