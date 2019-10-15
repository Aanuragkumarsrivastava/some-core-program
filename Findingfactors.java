package demo1;

import java.util.Scanner;

public class Findingfactors {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter the number to find the factor\n");
		
		int no = in.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
				System.out.println(i);
		}
		
	}

}
