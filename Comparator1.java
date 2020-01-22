import java.util.*;
import java.util.Comparator;
class Employee implements Comparable<Employee>
{	String name;
	int age;
	int id;
	int salary;
	Employee(String n,int a,int i,int s)
	{
		name=n;
		id=i;
		age=a;
		salary=s;
	}
	public String toString()
	{

		return "EmployeeName"+name+"id"+id+"salary"+salary+"age"+age;	
	}
	public int compareTo(Employee ee)
	{

		return this.id-ee.id;
	}
	public int getid()
	{
		return this.id;
	}
	public String getname()
	{
		return this.name;
	}
	public int getssalary()
	{
		return this.salary;
	}

	
}
class com3 implements Comparator<Employee>
{
public int compare(Employee e1,Employee e2)
		{
			return e1.getname().compareTo(e2.getname());
		}

} 
class Comparator1
{
	public static void main(String[] args) 
	{
		List<Employee>Emp_Data=new ArrayList<>();
		Emp_Data.add(new Employee("ABC",30,97,10000));
		Emp_Data.add(new Employee("ABCD",31,9,10001));
		Emp_Data.add(new Employee("ABCDE",32,99,10002));
		Emp_Data.add(new Employee("ABCDEF",33,1,10003));
		Emp_Data.add(new Employee("ABCDEFG",34,101,10004));
		System.out.println(Emp_Data);
		Collections.sort(Emp_Data);
		System.out.println(Emp_Data);
		
		
		Comparator<Employee> comp=new com3();
	
	Collections.sort(Emp_Data,comp);

	}
}