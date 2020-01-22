import java.util.Scanner;
class Jagged
{
	public static void main(String args[])
	{
	int a[][]=new int[3][];
	int i,j;
	a[0]=new int[3];
	a[1]=new int[2];
	a[2]=new int[1];
	Scanner s=new Scanner(System.in);
	for(i=0;i<3;i++)
	{
		for(j=0;j<a[i].length;j++)
		{
		a[i][j]=s.nextInt();
		}
	}
	System.out.println("Jagged Array:\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<a[i].length;j++)
		{
		System.out.print(a[i][j]+" ");
		}
		System.out.print("\n");
	}
	}
}
	