//display 2d matrix and display addition of odd elements
import java.lang.*;
import java.io.*;
import java.util.*;

class Program15
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
				if((Arr[i][j]%2) != 0)
				{
					iSum = iSum + Arr[i][j];
				}
			}
		}
		System.out.println("Addition of all elements are : "+iSum);
	}
}
