package demo1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the two numbers to perform the calculator operation");
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println("enter your choice");
		int choice=in.nextInt();
		
		switch(choice)
		{
		case 1:int c=a+b;
				System.out.println("the numbers are added and result is "+c);
				break;
		case 2:int d=a-b;
		System.out.println("the numbers are subtracted and result is "+d);
		break;
		case 3:int e=a*b;
		System.out.println("the numbers are multiplied and result is "+e);
		break;
		case 4:float f=a/b;
		System.out.println("the numbers are divided and result is "+f);
		break;
		default:System.out.println("invalid input");
				
		}

	}

}
