package Operator;

import java.util.Scanner;

public class IncrementDecrementOperator 
{

	public static void main(String[] args) 
	{
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number: ");   //accept the input from the user
        a=s.nextInt();

		System.out.println(a++);			//Post increment
		System.out.println(++a);			//Pre increment
		System.out.println(a--);			//Post decrement
		System.out.println(--a);			//Pre decrement
	}

}
