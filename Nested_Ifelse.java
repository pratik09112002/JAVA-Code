package Operator;

import java.util.Scanner;

public class Nested_Ifelse 
{
	public static void main (String[] args)
	{
		int n1,n2,n3;

		System.out.print("Enter First Number: ");
		Scanner a= new Scanner(System.in);
		n1=a.nextInt();

		System.out.print("Enter Second Number: ");
		Scanner b= new Scanner(System.in);
		n2=b.nextInt();

		System.out.print("Enter Third Number: ");
		Scanner c= new Scanner(System.in);
		n3=c.nextInt();

		if(n1>n2)
		{
			if(n1>n3 )
			{
				System.out.print("Maximum Number is:"+ " "+ n1);
			}
			
			else
			{
				System.out.print("Maximum Number is:"+ " "+ n3);
			}
		}
		else
		{
			if(n2>n3 )
			{
				System.out.print("Maximum Number is:"+ " "+ n2);
			}
			else
			{
				System.out.print("Maximum Number is:"+ " "+ n3);
			}
		}

	}
}
