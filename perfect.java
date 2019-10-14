package demo1;

import java.util.Scanner;

public class perfect {


	public static void main(String[] args) 
	{
		
	System.out.println("enter the number to check wether it's perfect number or not");
	
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int no=in.nextInt();
		
		int sum=0;
		int dup=no;
		
		for(int i=1;i<no;i++)
		{
			if(no%i==0) 
			{
				sum=sum+i;
			}	
		}	
		if(sum==dup)
			System.out.println("IT IS PERFECT NUMBER");
		else
			System.out.println("NOT PERFECT NUMBER");
		
	}
}
