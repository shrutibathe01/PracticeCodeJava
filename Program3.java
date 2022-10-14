//accept the string and count how many words are there
//this code works only if string starts with word and between each word only one white space
//it is not work for multiple whitespace and string starting with whitespace
import java.io.*;
import java.util.*;

class Program3
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String str=sobj.nextLine(); 
		
		String arr[] = str.split(" ");
		
		System.out.println("Number of words are : "+arr.length);
		
	}
}