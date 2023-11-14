package Operator;

import java.util.Scanner;

public class Logical_operator {

	public static void main(String[] args) 
	{
		int a,b;
	 	Scanner s = new Scanner(System.in);
		System.out.println("Enter a First number: ");
         	a=s.nextInt();

		System.out.println("Enter a Second number: ");
		b=s.nextInt();

		System.out.println(a==b && a!=b);		 
		System.out.println(a==b || a!=b);		
		System.out.println(!(a>b));	
	}

}
