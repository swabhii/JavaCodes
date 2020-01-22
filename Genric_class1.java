import java.util.*;
class Test<T>
{
    T a;
    Test(T v)
    {
        this.a=v;
    }
    void print()
    {
        System.out.println(a);
    }
}
class Genric_class1
{
	public static void main(String args[])
	{
		Test<Integer> t1=new Test<Integer>(99);
        t1.print();
        Test<String> t2=new Test<String>("Chitkara");
        t2.print();
	}
}
