//accept the string and count how many words are there
//it handels when there are multiple whitespaces in between two words 
//it will not work if there are multiple whitespaces in starting of string
import java.io.*;
import java.util.*;

class Program4
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String str=sobj.nextLine(); 
		
		String newstr = str.replaceAll("\\s+"," ");
		
		String arr[] = newstr.split(" ");
		
		System.out.println("Number of words are : "+arr.length);
		
	}
}