import java.util.Scanner;
import java.util.Arrays;
class ToString
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
		a[i]=s.nextInt();
		}
		String str=Arrays.toString(a); //will convert the int array into string and becomes easy to print
		System.out.println(str);
	}
}