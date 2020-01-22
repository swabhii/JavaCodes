import java.util.Scanner;
class CounterGame
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER A DECIMAL NUMBER: ");
	int num,i=0;
	num=s.nextInt();
	int arr[]=new int[32];
	while(num>=0)
	{
		if(num%2==0)
		{
			arr[i]=0;
			num=num/2;
			i++;
		}
		else
		{
			arr[i]=1;
			num=num/2;
			i++;
		}
	}
	}
}
	
	