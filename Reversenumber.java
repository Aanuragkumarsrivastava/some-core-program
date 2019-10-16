package demo1;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the  number to check wether it is pallindrome or not\n");
		int a=in.nextInt();
		int sum=0;
		int dup=a;
		
		while(a>0)
		{
		
		int r=a%10;//to find the reminder
		
		sum = sum*10+r; // adding the reminder to the sum
		
		a=a/10;//removing the last digit
		}
		
	if(dup==sum)
		System.out.println("PALLINDROME");
	else
		System.out.println("NOT PALLINDROME");
	}

}
