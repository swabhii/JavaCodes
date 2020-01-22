class A
{
	{
	System.out.print("Initilazer Block");// The code which we want to execute for all the objects and will be executed before the code of constructor, useful in nested classes
	}
	A()
	{
	System.out.println("Constructor");
	}
}
class InitializerBlock
{
	public static void main(String args[])
	{
	A a=new A();//will first call Initilizer block and then the default constructor FOR ALL OBJECTS
	A b=new A();
	}
}