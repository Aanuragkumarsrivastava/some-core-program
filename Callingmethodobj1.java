package demo1;

public class Callingmethodobj1 
{

		public int sum(int x,int y)
		{
			return(x+y);
		}
		
		public static void string(String name)
		{
			System.out.println("the name of the program is "+name);
		}

		public static void main(String[] args) 
		{
			Callingmethodobj1 obj=new Callingmethodobj1();//without adding static to sum method the object is used
			int res = obj.sum(4,6);
			System.out.println("the sum of number is "+res);
			string("sum");
		

		}

	}
