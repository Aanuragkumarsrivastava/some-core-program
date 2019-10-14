package demo1;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) 
	{
		
		System.out.println("enter the letter");
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		char ch=str.charAt(0);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				
				System.out.println("VOWEL");
			
			else
				
				System.out.println("CONSONENT");


	}
}
