import java.util.Scanner;
class Rotation
{
	public static void main
	{
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		int i,num;
		System.out.println("ENTER THE ELEMENTS OF ARRAY:");
		for(i=0;i<5;i++)
		{
			a[i]=s.newInt();
		}
		System.out.println("ENTER THE NUMBER OF TIMES ARRAY HAS  TO BE ROTATED");
		int n=s.nextInt();
		for(i=n;i>=1;i--)
		{
			num=a[0];
			a[i-1]=a[i];
		}
		a[4]=num;
		System.out.println("ROTATED ARRAY:");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}		
		