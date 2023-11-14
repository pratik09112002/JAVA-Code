package Operator;

import java.util.Scanner;

public class Assignment_operator 
{

	public static void main(String[] args) 
	{
		int a;
	 	Scanner s = new Scanner(System.in);
		System.out.println("Enter a Any number: ");
         	a=s.nextInt();
			
		a+=10;
		System.out.println("Result is : "+a);
				
		a-=10;
		System.out.println("Result is : "+a);		

		a*=10;
		System.out.println("Result is : "+a);		

		a/=10;
		System.out.println("Result is : "+a);		

		a%=10;
		System.out.println("Result is : "+a);		
	}

}
