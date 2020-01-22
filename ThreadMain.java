import java.util.*;
class A extends Thread
{
	 public void run()
	{
	int i;
	for(i=0;i<10;i++)
	{
		System.out.println(i+"Thread A");
	}
	System.out.println("Name:"+Thread.currentThread().getName()); } //will give name of the current thread
}

class B extends Thread
{
	 public void run()
	{
	int j;
	for(j=0;j<10;j++)
	{
		System.out.println(j+"Thread B");
	}
	System.out.println("Name:"+Thread.currentThread().getName()); } //will give name of the current thread
}
class ThreadMain
{
	public static void main(String args[])
	{
	A a=new A(); //object & thread created
	B b=new B();
	a.start(); //will run 'run' function as a thread
	//a.run(); //will run 'run' function as a normal function and will print 'main' 
	//b.run(); //Through 'run', it will run as
	b.start();
	}
}