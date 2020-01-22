import java.util.Scanner;
class TwoDArray
{
	public static void main(String args[])
	{
	int a[][]=new int[3][3];
	int i,j;
	Scanner s=new Scanner(System.in);
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
		a[i][j]=s.nextInt();
		}
	}
	System.out.println("Two Dimensional Array:\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
		System.out.print(a[j]+" ");
		}
		System.out.print("\n");
	}
	}
}