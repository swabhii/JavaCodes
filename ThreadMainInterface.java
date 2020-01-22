import java.util.Scanner;
class ThreadDemo implements Runnable
{
	public void run()
	{
	System.out.println("In thread");
	}
}
class ThreadMainInterface
{
	public static void main(String args[])
	{
		Thread t1=new Thread(new ThreadDemo());
		t1.start();
	}
}

//threads can be implemented using Runnable interface
//earlier the class in which run func was declared that used to extend thread class and we used to amke object of that class only
//Now, this class implements runnable interface and the object is made of thread class in which object of the threaddemo class is passed