import java.util.*;
class StringBuilderCode
{
	public static void main(String args[])
	{
		StringBuilder sb=new StringBuilder();//Constructor-StringBuilder()
		sb.append("Chitkara");//insert
		sb.append("University");//insert
		System.out.println(sb);
		

		StringBuilder sb1=new StringBuilder(5);
		sb1.append("abcde");
		System.out.println(sb1);
		
		StringBuilder sb2=new StringBuilder("Chitkara");
		sb2.append("University");
		System.out.println(sb2);
		
		String str="Swabhi";//string
		StringBuilder sb3=new StringBuilder(str);//string passed
		sb3.append("Papneja");
		System.out.println(sb3);
		

		System.out.println(sb2.capacity()); //need to be compulsarily same as the length of the string
		System.out.println(sb.length());
		System.out.println(sb2.charAt(2));
		System.out.println(sb3.delete(1,2));
		System.out.println(sb.deleteCharAt(3));
		System.out.println(sb3.replace(0,4,"SWABHI"));
		System.out.println(sb.indexOf("A"));
		System.out.println(sb.lastIndexOf("A"));
		System.out.println(sb.reverse());
		
	}
}


//modifyable directly

/*Constructors of String Builder
StringBuilder()
StringBuilder(int capacity)//size of string builder specified
StringBuilder(char sequence)//to initialse a string builder
StringBuilder(String s)//to amke a string mutable*/

//sb.capacity()- is a func that returns capacity

/*
int capacity()-capacity of SB
char charAt(index)-returns the character at that index
StringBuilder delete(int s,int e)-s to e delete and then return
void ensureCapacity()
StringBuilder deletecharAt (index)
int indexOf()
lastindexOf()
length()


*/











