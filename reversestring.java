package demo1;

import java.util.Scanner;

public class reversestring
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter the word\n");
		
		String s = in.next();
		// we can keep like this also String s = in.nextLine();
		//it will also possible to reverse the sentence using the nextLine()
		for (int i = s.length() - 1; i >= 0; i--)
			// here we will take the string in reverse manner

			System.out.print(s.charAt(i));

	}

}
