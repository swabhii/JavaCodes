import java.util.*;
class ExcpHandling2
{
	public static void main(String args[])
	{
		String s=null;
		try
		{
		System.out.println(s.length());//First statement will be catched
		System.out.println(1/0);	//This will be skipped
		}
		catch(ArithmeticException|NullPointerException e)
		{
			System.out.println(e);  //Null pointer Exception
			System.out.println("No output");
		}
		System.out.println("10"+0+9);

	}
}
	

		