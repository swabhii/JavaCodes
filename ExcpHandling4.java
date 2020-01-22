import java.util.*;
class ExcpHandling4
{
	public static void main(String args[])
	{
		String s="null";
		try
		{
		System.out.println(s.length()); //4
		System.out.println(1/2);	//output
		}
		catch(ArithmeticException|NullPointerException e) //will not be executed
		{
			System.out.println(e);  
			//System.out.println("No output");
		}

	}
}