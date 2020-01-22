class Parent
{
	int x;
	Parent(int a)
	{
	x=a;
	}
}
class Child extends Parent
{
	int y;
	Child(int a, int b)
	{
	super(a);
	y=b;
	}
	void show()
	{
	System.out.println("x = "+x+"\ny = "+y);
	}
}
class ParameterisedConstructor
{
	public static void main(String args[])
	{
	Child c=new Child(5,10);
	c.show();
	}
} 
