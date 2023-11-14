package Operator;

import java.util.Scanner;

public class Elseif_statement 
{
	public static void main (String[] args)
	{
		int s1,s2,s3,s4,s5,total;

		System.out.print("Marathi: ");
		Scanner marathi= new Scanner(System.in);
		s1=marathi.nextInt();

		System.out.print("English: ");
		Scanner english= new Scanner(System.in);
		s2=english.nextInt();

		System.out.print("Science: ");
		Scanner science= new Scanner(System.in);
		s3=science.nextInt();

		System.out.print("Mathematics: ");
		Scanner maths= new Scanner(System.in);
		s4=maths.nextInt();

		System.out.print("History: ");
		Scanner history= new Scanner(System.in);
		s5=history.nextInt();
		
		total=(s1+s2+s3+s4+s5)*100/500;
		System.out.println("Student overall marks is:" + " " +total);

		if(total>=90)
		{
			System.out.print("Student is Brilliant.");
		}
		else if(total>=70 && total<90)
		{
			System.out.print("Student is Clever.");
		}
		else if(total>=50 && total<70)
		{
			System.out.print("Student is Average.");
		}
		else if(total>=35 && total<50)
		{
			System.out.print("Student is Pass.");
		}
		else
		{
			System.out.print("Student is Fail.");
		}

	}
}
