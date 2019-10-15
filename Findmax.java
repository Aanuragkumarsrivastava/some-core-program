package demo1;

import java.util.Scanner;

public class Findmax {

	public static void main(String[] args)
	{
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("user please enter the numbers\n");
		
		int a=in.nextInt();
		int b=in.nextInt();
		
		int max= a>b?a:b;
		//for three  numbers if you want to find suppose c is the third number
		//int max = a>b&a>c?a:b>c?b:c
		
		System.out.println("maximum of two numbers is "+max);

	}

}
