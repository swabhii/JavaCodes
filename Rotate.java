import java.util.Scanner;
class Rotate
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		int i,j;
		int temp;
		System.out.println("ENTER THE ELEMENTS OF ARRAY:");
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		temp=a[4];
		System.out.println("ENTER THE NUMBER OF TIMES ARRAY HAS  TO BE ROTATED");
		int n=s.nextInt();
		for(j=0;j<n;j++)
		{
			temp=a[4];
			for(i=3;i>=0;i--)
			{
			a[i+1]=a[i];
			}
			a[0]=temp;
		}
		
		System.out.println("ROTATED ARRAY:");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}		
