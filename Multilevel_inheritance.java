import java.util.Scanner;
class A
{
	int a=10;
	int b=20;
}
class B extends A
{
	void show()
	{
	System.out.println(a+b);
	}
}
class C extends B
{
	void show_two()
	{
	System.out.println("Multilevel Inheritance");
	}
}
class Multilevel_inheritance
{
	public static void main(String args[])
	{
	B b=new B();
	b.show();
	C c=new C();
	c.show_two();
	}
}
