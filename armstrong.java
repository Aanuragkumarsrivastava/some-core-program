package demo1;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) 
	{
		System.out.println("enter the number\n");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
				int no = in.nextInt();
				int dup=no;int r;
				int sum=0;
				while(no>0)
				{
					r=no%10;
					//below is also correct there we use math power
					//sum+=Math.pow(r, 3);
					sum=sum+(r*r*r);
					no=no/10;

				}
				if(dup == sum)
					System.out.println(dup +" is armstrong!!");
				else
					System.out.println(dup +" is not armstrong!!");





			}

}
