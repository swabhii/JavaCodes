import java.util.Scanner;
class Sort
{
	public static void main (String args[])
	{
	  int a[]=new int [5];
	  Scanner s = new Scanner(System.in);
	  int i,j,temp;
	  for(i=0;i<5;i++)
	  {
  	    a[i]=s.nextInt();
	  }
	  System.out.println("Array elements are:");
	  for(i=0;i<5;i++)
	  {
 	    System.out.println(a[i]);
	  }
	  System.out.println("Sorted Elements:");
	  for(i=0;i<5;i++)
	  {
	    for(j=i+1;j<5;j++)
	    {
		if(a[j]<a[i])
		{
		  temp=a[i];
		  a[i]=a[j];
		  a[j]=temp;
		}
	     }
	   }
	   for(i=0;i<5;i++)
	  {
 	    System.out.println(a[i]);
	  }
	}
}