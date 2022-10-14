//accept the string and count how many words are there
//it handels all the cases

import java.io.*;
import java.util.*;

class Program5
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String str=sobj.nextLine(); 		
		String newstr = str.replaceAll("\\s+"," ");
		String newstr2 = newstr.trim();
		
		String arr[] = newstr2.split(" ");
		
		System.out.println("Number of words are : "+arr.length);
		
	}
}