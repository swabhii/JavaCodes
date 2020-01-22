import java.util.*;
class ExcpHandling1
{
	public static void main(String args[])
	{
	System.out.println("Hello");
	String s=null;	//NULL POINTER EXCEPTION
	try {
		System.out.println(s.length());//4
	      }
	//catch(ArithmeticException e) WILL GIVE ERROR BECAUSE THE CLASS WHOSE ERROR OCCURS, THE SAME CLASS' OBJECT HAS TO BE DECLARED
	catch(NullPointerException e)
		{
		System.out.println(e+ " Error catched");
		}
	int a=20;
	try
	{
		System.out.println(a/0);
	}
	catch(ArithmeticException j)
	{
		System.out.println("This is not possible");
	}
		
	System.out.println("World");
	}
	
}
//"null"- 4
//null - Null Pointer Exception

//Exception array of count-common exception
//Throwable class- subclasses(Error, Exception)
//Exception- subclasses(IO exp, ClassNotFound exp, Runtime exp) runtime-unchecked exp, handling necessary, compilation successful, unexpected o/p, 
//runtime-arithmetic (eg-divide by 0)
// null pointer exp- thrown by jvm
//illegal argument exp-

