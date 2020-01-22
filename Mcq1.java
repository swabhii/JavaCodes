class Test
{
	protected int x,y;//accessible within the same package-here, by deafult in same package
}
class Mcq1
{
	public static void main(String args[])
	{
	Test t=new Test();
	System.out.println(t.x+" "+t.y);//0 0
	}
}
//protected-0
//public/default-garbage value
//class variables-never garbage
//default constructor initializes a variable with 0