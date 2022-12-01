//display 2d matrix and display addition of diagonal elements 
import java.lang.*;
import java.io.*;
import java.util.*;

class Program17
{
	public static void main(String arg[])
	{
		int i=0,j=0,iSum=0;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number of rows: ");
		int iRow = sobj.nextInt();
		
		System.out.println("Enter Number of columns: ");
		int iCol = sobj.nextInt();
		
	    int Arr[][]=new int[iRow][iCol];
		
		if(iRow != iCol)
		{
			System.out.println("Rows and Columns are not equal");
			return;
		}
		
		System.out.println("Enter The Elements");
		
		for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<Arr[i].length;j++)
			{
				Arr[i][j] = sobj.nextInt();
			}
		}
		
		for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<Arr[i].length;j++)
			{
				if(i==j)
				{
					iSum = iSum + Arr[i][j];
				}
			}
		}
		System.out.println("Addition of all elements are : "+iSum);
		
	}
}
