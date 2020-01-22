import java.util.Scanner;
class SmallestTwoD
{
	public static void main(String args[])
	{
	int [][]=new int[3][3];
	int i,j,num1,num2;
	Scanner s=new Scanner(System.in);
	for(i=0;i<3;i++)
	{
		for(j=0;<3;j++)
		{
			a[i][j]=s.nextInt();,
	}
	num1=a[0][0];
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			if(a[i][j]<num1)
			num1=a[i][j];
		}
	}
	System.out.println("Smallest element is "+num1);
	}
}
