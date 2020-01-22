import java.util.Scanner;
class Code1
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int arr[]=new int[n];

for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
int sum=0;
for(int i=0;i<n;i++)
{
sum=sum+arr[i];
}
for(int i=0;i<n;i++)
{
arr[i]=sum-arr[i];
}

for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}
}
}