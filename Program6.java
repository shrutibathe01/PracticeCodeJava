//accept the string and find length of maximum letter words
//it handels all the cases
import java.io.*;
import java.util.*;

class Program6
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String str=sobj.nextLine(); 
		
		String newstr = str.replaceAll("\\s+"," ");
		String newstr2 = newstr.trim();
		
		String arr[] = newstr2.split(" ");
		
		int iMax=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>iMax)
			{
				iMax=arr[i].length();
			}
			
		}
		System.out.println("Length of largest word is : "+iMax);
		
	}
}