import java.util.Scanner;
class Search
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		int i,j,num,flag=0;
		System.out.println("ENTE THE ELEMENTS OF ARRAY:");
		for(i=0;i<5;i++)
		{
		a[i]=s.nextInt();
		}
		System.out.println("ENTER THE ELEMENT YOU WANT TO SEARCH:");
		num=s.nextInt();
		for(i=0;i<5;i++)
		{
			if(a[i]==num)
			flag++;
		}
		if(flag!=0)
		System.out.println(num+" found at index "+i);
		else
		System.out.println(num+" not found");
	}
}
		