class A extends Thread
{
    public void run()
    {
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println(i+" THREAD A");
            System.out.println("Name: "+Thread.currentThread().getName());
        }
    }
}
class B extends Thread
{
    public void run()
    {
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println(i+" THREAD B");
            System.out.println("Name: "+Thread.currentThread().getName());
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    A a=new A();
	    B b=new B();
	    a.start();
	    b.start();
	    }
}

