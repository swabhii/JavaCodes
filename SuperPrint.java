class A
{
	int x=10;
	void show()
	{
	System.out.println("Parent's Show Function");
	}
}
class B extends A
{
	int x=99;
	void show()
	{
	System.out.println("In derived");
	System.out.println(super.x);//10 if write sop(x)-99
	}
	void display()
	{
	show(); //local
	super.show();//parent
	}
}
class SuperPrint
{
	public static void main(String args[])
	{
	B b=new B();
	b.display();
	}
}