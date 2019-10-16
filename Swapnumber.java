package demo1;

import java.util.Scanner;

public class Swapnumber {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the two number to be swapped\n");
		int a=in.nextInt();
		int b=in.nextInt();
		
		a=a+b;
		
		b=a-b;
		
		a=a-b;
		
		System.out.println("swapped number is a="+a+" and b="+b);
	}

}
