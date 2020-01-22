/*Java:

Final keyword
-vairiable
-class
-method*/

//final variable, the one which remains const, we cannot reassign new values to a final variable, throughout the program the values of final variable will remain same
//final variables are initiliazed at the time of declaration
//commcannot initiliaze again
//static final variable- can be initiliazed only using static inilializer block
//static variable is the one which can be accessed without creating an object of the class

import java.util.Scanner;
class Test
{
	final int y;
	final int i=10;
	final int j;
	static final int k;
	{
	j=10;
	}
	static
	{
	k=99;
	}
	Test()
	{
	y=88;
	}
	public static void main(String args[])
	{
		Test t=new Test();
		//t.i=80; error
		//t.y=88;
		final int arr={1,2,3,4,5};
		for(int ii=0;ii<5;ii++)
		{
			arr[ii]=arr[ii]*10;
		}
		System.out.println("j="+t.j+" k="+t.k+" y="+t.y+" ");
		for(int p=0;p<5;p++)
		{
		System.out.println(arr[p]);
		}
	}
	
}

//final methods cannot be over ridden (Final methods - the child class cannot have methods with same name as final methods in base class
//final class that cannot be inherited	
	
	
