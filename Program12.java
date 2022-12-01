//display 2d matrix
import java.lang.*;
import java.io.*;
import java.util.*;

class Program12
{
	public static void main(String arg[])
	{
		int i=0,j=0;
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
		
		System.out.println("Elements in matrix are: ");
		for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<Arr[i].length;j++)
			{
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
