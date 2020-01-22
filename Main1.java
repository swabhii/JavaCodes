class ThreadP extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
	    }
    }
}
class ThreadP1 extends Thread
{
    public void run()
    {
        for(int j=0;j<5;j++)
        {
            System.out.println(j);
	    }
    }
}
public class Main
1{
	public static void Main(String[] args) {
	    ThreadP T1=new ThreadP();
	    ThreadP1 T2=new ThreadP1();
		System.out.println(T1.getPriority());
		System.out.println(T2.getPriority());
		T1.setPriority(10);
		T2.setPriority(8);
		System.out.println(T1.getPriority());
		System.out.println(T2.getPriority());
	}
}
