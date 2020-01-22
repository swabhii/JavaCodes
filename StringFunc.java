import java.util.Scanner;
class StringFunc
{
	public static void main(String args[])
	{
		String s="CHITKARA UNIVERSITY";
		String s1="PUNJAB";
		System.out.println(s.length());//length of the string
		System.out.println(s.charAt(2));//at indext 2
		System.out.println(s.substring(2,5)); //i to j-1
		System.out.println(s.concat(s1));//merge
		System.out.println(s.substring(3)); //i to end of the string
		String s2="ABC KARA COZ XYZ KARA";
		System.out.println(s.indexOf("KARA"));//where KARA starts
		System.out.println(s.indexOf("KARA",7));//
		System.out.println(s.lastIndexOf('A'));//
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.trim());//to delete extra spaces in the beginning and ending of the string. eg: "  abc  " -> "abc"
	
	}
}
//s1= abc s2=ABC
//equals- s1.equals(s2) false
//equalsIgnoreCase- s1.equalsIgnoreCase(s2) true
//s1.replace('a','b');