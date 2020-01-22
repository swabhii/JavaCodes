import java.util.Scanner;
class StringSearch
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt(); 
	int z=0;
	String str[]=new String[n];
	for(int i=0;i<n;i++)
	{
		str[i]=s.nextLine();
	}
	String str1=s.nextLine();
	for(int i=0;i<n;i++)
	{
		if(str[i]==str1)
		{
			System.out.println("Element found at "+i);
			z=0;
			break;
		}
		else
		{
			z++;
		}
	}
	if(z>0)
	System.out.println("Element not found");
	}
}
		
			
