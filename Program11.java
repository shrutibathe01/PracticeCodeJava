import java.lang.*;
import java.util.*;

class Program11
{
	public static void main(String a[])
	{
		int iCnt=0,mult=1;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int iNo1=sobj.nextInt();
		
		System.out.println("Enter Power: ");
		int iNo2=sobj.nextInt();
		
	    for(iCnt=1;iCnt<=iNo2;iCnt++)
		{
			mult=mult*iNo1;
		}
		System.out.println("Power is "+mult);
		
	}
}