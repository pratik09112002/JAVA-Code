package Operator;

import java.util.Scanner;

public class Circle 
{

	public static void main(String[] args) 
	{
				double radius,area,circumference;
				Scanner s = new Scanner(System.in);
				System.out.println("Enter Radius Of Circle: ");
				radius = s.nextDouble();
				
				area = (3.14*radius*radius);
				System.out.println("Area Of Circle: " + area);

				circumference = 2*3.14*radius;
				System.out.println("Circumference Of Circle: " + circumference);

	}

}
