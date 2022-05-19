package Practice1;

public class Employee {
	int id;
	String name;
	float salary;
	public void insert(int r, String n, float s)
	{
		id=r;
		name=n;
		salary=s;
	}
public void display()
{
	System.out.println("id is"+id+" name is :"+name+" salary is :"+salary);
}
}
