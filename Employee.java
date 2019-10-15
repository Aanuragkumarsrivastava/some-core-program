package demo1;

public class Employee
{
	private int id;
	private String name;
	private double salary;
	
	
	public Employee(int a,String b,double c)
	{
		id=a;
		name=b;
		salary=c;
	}

	public static void main(String[] args)
	{
		Employee obj=new Employee(1,"ram",2000);
		System.out.println(obj.id+"\n"+obj.name+"\n"+obj.salary);
		

	}

}
