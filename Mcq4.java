class Mcq4
{
	private static int x;
	public static void main(String args[])
	{
	System.out.print(fun());
	}
	static int fun()
	{
	//static int x;
	return ++x;
	}
}
	
	


//static-can be called without making the object
//static variables cannot be of functions/methods OR Methods cannot have static local variables
//We can have class static members to count no of function calls and other purposes that C++ local static variables serve