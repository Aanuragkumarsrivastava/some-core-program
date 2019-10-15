package demo1;

public class Callingmethod 
{
	public static void sum(int x,int y)
	{
		int z=x+y;
		System.out.println("the sum of the numbers  is "+z);
	}
	
	public static void string(String name)
	{
		System.out.println("the name of the program is "+name);
	}

	public static void main(String[] args) 
	{
		sum(4,6);
		string("sum");
	

	}

}
