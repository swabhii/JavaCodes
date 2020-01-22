import java.util.Scanner;
class ThreeDArray
{
	public static void main(String args[])
	{
	int a[][][]=new int[3][2][2]; //3 2D arrays, with 2 rows in each 2D array and 2 columns in each row
	Scanner s=new Scanner(System.in);
	int k,i,j;
	for(k=0;k<3;k++)// No of arrays
	{
		for(i=0;i<2;i++)//No of rows
		{
			for(j=0;j<2;j++)//Columns
			{
			a[k][i][j]=s.nextInt();
			}
		}
	}
	System.out.println("THREE D ARRAY:\n");
	for(k=0;k<3;k++)
	{
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			System.out.print("a["+k+"]a["+i+"]a["+j+"] ="+a[k][i][j]+"\n");
			}
			//System.out.print("\n");
		}
	}
	}
}
