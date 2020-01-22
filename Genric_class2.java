import java.util.*;
class Test<T>
{
    T print(T a1)
    {
        return a1;
    }
}
class Genric_class2
{
	public static void main(String args[])
	{
		Test<Integer> t1=new Test<Integer>();
        System.out.println(t1.print(99));
        Test<String> t2=new Test<String>();
        System.out.println(t2.print("Chitkara"));
	}
}
