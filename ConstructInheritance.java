class Parent
{
	Parent()
	{
	System.out.println("Parent Class Constructor");
	}
}
class Child extends Parent
{
	Child()
	{
	System.out.println("Child Class Constructor");
	}
}
class ConstructInheritance
{
	public static void main(String args[])
	{
	Child c=new Child();//will firts call the parent class constructor and then the child class constructor
	}
}