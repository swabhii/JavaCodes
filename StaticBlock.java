class A
{
	static int a;
	int b;
	static
	{
	a=10;
	System.out.println("Static block"); //It will be called for the first object declared/initialised
	}

	A()
	{
	b=20;
	System.out.println("Constructor");
	}
}
class StaticBlock
{
	public static void main(String args[])
	{
	A a1=new A();//will call static block and then constructor 
	A a2=new A();// only constructor
	System.out.println("If not using constructor and directly accessing the values - "+A.a);
	}
} 


//for the first time static variable excess 
//for the first object