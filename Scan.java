import java.util.Scanner;
class Scan
{
	public static void main(String args[])
	{
	  int a[]=new int [5];
	  Scanner s = new Scanner(System.in);
	  int i;
	  for(i=0;i<5;i++)
	  {
  	    a[i]=s.nextInt();
	  }
	  System.out.println("Array elements are:");
	  for(i=0;i<5;i++)
	  {
 	    System.out.println(a[i]);
	  }
	}
}