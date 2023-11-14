package Operator;

import java.util.Scanner;

public class If_Else_statement 
{
	public static void main (String[] args)
	{
		int pwd;

		System.out.println("Enter Password : ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();

		if(pwd==7521)
		{
			System.out.println("Name: Pratik Bhalerao ");
			System.out.println("Age: 21 ");
			System.out.println("Mobile No.: 4578894556 ");
		}
		else
		{
			System.out.println("Sorry!!! Wrong Password....");
		}   
	}
}
