import java.util.Scanner;
class ConvertableStrings
{
	public static void main(String args[])
	{
		String s1,s2;
		int a[]=new int[20];
		int b[]=new int[20];
		int flag=0;
		Scanner s=new Scanner(System.in);
		s1=s.nextLine();
		s2=s.nextLine();
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
				a[i]=i;
				else
				b[i]=i;
			}
			for(int i=0;i<s2.length();i++)
			{
				flag=0;
				if(s2.charAt(a[i])=='a'||s2.charAt(a[i])=='e'||s2.charAt(a[i])=='i'||s2.charAt(a[i])=='o'||s2.charAt(a[i])=='u')
				{ flag++;
				}
				else
				{
				flag=-1;
				break;
				}
			}
			if(flag<0)
			System.out.println("Non Convertable Strings");
			if(flag>0) {
			for(int i=0;i<s2.length();i++)
			{
				flag=0;
				if(s2.charAt(b[i])!='a'&&s2.charAt(b[i])!='e'&&s2.charAt(b[i])!='i'&&s2.charAt(b[i])!='o'&&s2.charAt(b[i])!='u')
				{flag++;}
				else 
				{ flag=-1;
				break; }
				
			} 
			if(flag<0)
			System.out.println("Non Convertable Strings"); }
			if(flag>0)
			{
				System.out.println("Convertable Strings");
			}
		}
		else
		System.out.println("Non Convertable Strings");
	}
}