import java.util.Scanner;
class StringFunc2
{
	public static void main(String args[])
	{
		String str1="CHITKARA";
		String str2="UNIVERSITY";
		//str1=str1.concat(str2);
		//System.out.println(str1);//CHITKARAUNIVERSITY
		str1.concat(str2);
		System.out.println(str1);//CHITKARA 
		
	}
}

//Immutable
//- string, string builder, string buffer
//-string- Immutable (str1 & str2 are objects, if we want to change an object, we need to store it in another variable/reference variables)
//string builder- provides mutable strings