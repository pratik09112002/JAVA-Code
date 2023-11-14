package Operator;

import java.util.Scanner;

public class Comparison_operator 
{

	public static void main(String[] args) 
	{
		int a,b;
	 	Scanner s = new Scanner(System.in);
		System.out.println("Enter a First number: ");
        a=s.nextInt();

		System.out.println("Enter a Second number: ");
		b=s.nextInt();

		System.out.println(a==b);		// a is equal to b
		System.out.println(a!=b);		// a is not equal to b
		System.out.println(a>=b);		// a is greater than  equal to b
		System.out.println(a<=b);		// a is less than equal to b
		System.out.println(a>b);		// a is greater than b
		System.out.println(a<b);		// a is less than b

	}

}
