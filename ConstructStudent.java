import java.util.Scanner;
class Student
{
	int id;
	String name;
	Scanner s=new Scanner(System.in);
	Student()
	{
	id=s.nextInt();
	name=s.next();
	}
	void show()
	{
	System.out.println("Name - "+name+"\nId - "+id);
	}
}
class Marks extends Student
{
	int a[]=new int [3];
	int total=0;
	Scanner s=new Scanner(System.in);
	Marks()
	{
		for(int i=0;i<3;i++)
		{
		a[i]=s.nextInt();
		}
	}
	void total()
	{
	for(int i=0;i<3;i++)
	{
	total=total+a[i];
	}
	System.out.println("Total Marks - "+total);
	}
}
class ConstructStudent
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	Marks m= new Marks();
	m.show();
	m.total();
	}
}

