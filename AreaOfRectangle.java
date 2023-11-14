package Operator;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) 
	{
		int length,breadth,area,perimeter;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Length Of Rectangle: ");
		length = s.nextInt();
		System.out.println("Enter Length Of Rectangle: ");
		breadth = s.nextInt();
		
		area=length*breadth;
		System.out.println("Area Of Rectangle: " + area);

		perimeter=(length+breadth)*2;
		System.out.println("Permeter Of Rectangle: " + perimeter);
	}

}
