import java.util.*;
class ExcpHandling3
{
	public static void main(String args[])
	{
		String s="null";
		try
		{
		System.out.println(s.length()); //4
		System.out.println(1/0);	//thrown
		}
		catch(ArithmeticException|NullPointerException e)
		{
			System.out.println(e);  //Arithmetic Exception
			//System.out.println("No output");
		}

	}
}