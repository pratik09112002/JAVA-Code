package Operator;

import java.util.Scanner;

public class Conditional_operator 
{

	public static void main(String[] args) 
	{
		int a, b, c,r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a First number: ");
		a=s.nextInt();

		System.out.println("Enter a Second number: ");
		b=s.nextInt();

		System.out.println("Enter a Third number: ");
		c=s.nextInt();

		r=(a>b)?(a>c?a:c):(b>c?b:c);			/*  Compare a and b if a is greater than b then checks 2nd condition a is graeter than c if yes 
										then print a  else print c. If a is not greater than b then check b is greater than c if yes 
										print b else print c.  */

		System.out.println("The Greatest Number is:"+   r);
		
	}

}
