import java.util*;
public class file
{
void print(String s)
{
String fst=" ';
int i=0;
for(i=0;i<s.length();)
{
	while(s.charAt(i)!=' ')
	{
	fst=fst+s.charAt(i);
	i++;
	}
	break;
}
String last= "";
int j=0;
for(j=s.length()-1;j>=i;)
{
	while(s.charAt(j)!=' ')
	{
	last=s.charAt(j)+last;
	j--;
	}
	break;
}
System.out.print(last);
for(int m=j;m>=i;m--)
{
System.out.print(s.charAt(m));
}
System.out.println(fst);
}
void count(String str)
{
char[] ch=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
String s="";
while(i<ch.length && ch[i]!= ' ')
{
s=s+ch[i];
i++;
}
if(s.length()>0)
System.out.println(s+"->"+s.length());
}
}
public static void main(String args[])
{
 file f=new file();
 Scanner sc=new Scanner(System.in);
 String s=sc.nextLine();
 f.print(s);
 f.count(s);
}
}


