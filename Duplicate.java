import java.util.Scanner;
class Duplicate
{
	public static void main(String args[])
	{
	int a[]=new int [5];
	
	int count=0;
	int i,j,n;

	Scanner s=new Scanner(System.in);
	//n=s.nextInt();
	n=5;
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
		
	}
	System.out.println("Duplicate Elements are:\n");
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n-1;j++)
		{
			if(a[i]==a[j])
			{
			for(int k=j;k<n-1;k++)
			{
			a[k]=a[k+1];
			}
			n--;
			j--;
			}
		}
		
		
	}
	for(i=0;i<n-1;i++)
	{
	
	System.out.print(a[i]+" ");
	}
	}
}
				


				
