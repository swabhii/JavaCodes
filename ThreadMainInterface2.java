import java.util.Scanner;
class A implements Runnable
{
	public void run()
	{
		int i;
		for(i=0;i<10;i++)
		{
			System.out.println(i+" Thread A");
		
		//System.out.println(Thread.CurrentThread().getName());
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e) { } }
	}
}
class B implements Runnable
{
	public void run()
	{
		int j;
		for(j=0;j<10;j++)
		{
			System.out.println(j+" Thread B");
		
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e) { } }
	}
}
class ThreadMainInterface2
{
	public static void main(String args[])
	{
		Thread t1=new Thread(new A());
		Thread t2=new Thread(new B());
		
		t2.start();
		try { t1.join(); } 
		catch(Exception e) { }
  		t1.start();
	             

	}
}

