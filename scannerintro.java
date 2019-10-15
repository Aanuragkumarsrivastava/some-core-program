package demo1;

import java.util.Scanner;

public class scannerintro
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		System.out.println("enter the first number\n");
		int x = in.nextInt();//for taking integer number
		System.out.println("enter the second number\n");
		float y = in.nextFloat();//for taking floating point number
		
		float z=x*y;
		System.out.println("the product of "+x+" and "+y+" is "+z);
	

	}

}
