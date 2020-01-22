import java.util.*;
class A extends Thread
{
	 public void run()
	{
	int i;
	for(i=0;i<10;i++)
	{
		System.out.println(i+" Thread A");
	}
	System.out.println("Name: "+Thread.currentThread().getName()); } //will give name of the current thread
}
class ThreadMain1
{
	public static void main(String args[])
	{
	A a=new A(); //object & thread created
	
	a.start(); //will run 'run' function as a thread
	//a.run(); //will run 'run' function as a normal function and will print 'main'
	//a.isAlive() - true if the thread is alive else false
	
	
	}
}