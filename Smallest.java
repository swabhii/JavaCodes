import java.util.Scanner;
class Smallest
{
	public static void main(String args[])
	{
	int a[]=new int[5];
	int i,j,num,num2;
	Scanner s=new Scanner(System.in);
	for(i=0;i<5;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("ARRAY ELEMENTS ARE\n");
	for(i=0;i<5;i++)
	{
		System.out.print(a[i]+" ");
	}
	
	num=a[0];
	num2=a[0];
	for(i=0;i<5;i++)
	{
		if(a[i]<num)
		num=a[i];
	}
	System.out.println("\nSmallest element- "+num+"\n");
	
	for(i=0;i<5;i++)
	{
		if((a[i]>num)&&(a[i]<num2))
		num2=a[i];
	}
	System.out.println("Second smallest element is- "+num2);
	}
}