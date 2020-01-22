import java.util.*;
class Comparator2
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
		
	Comparator<Employee> comp=new Comparator<>()
	{
		public int compare(Employee e1,Employee e2)
		{
			return e1.getname().compareTo(e2.getname);
		}
	};
	Collections.sort(Emp_Data,comp);
	System.out.println(Emp_Data);
	}
}