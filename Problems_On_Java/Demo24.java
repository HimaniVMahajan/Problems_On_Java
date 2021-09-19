/* Accept N numbers from user and accept Range, Display all elements from that Range. */

import java.lang.*;
import java.util.*;		//for Scanner class

class Range
{
	int i = 0, iCnt = 0;
	
	void display(int arr[],int iNo1,int iNo2,int iLen)
	{
		System.out.println();
		System.out.println("Numbers from that Range is:");
		for(i=0; i<iLen; i++)
		{
			if((arr[i]>=iNo1) && (arr[i]<=iNo2))
			{
				System.out.print(arr[i]+"\t");
			}
		}
	}
}

class Demo24
{
	public static void main(String args[])
	{
		int iRet = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("How many elements you want to be entered in array:-");
		int iSize = sobj.nextInt();
		
		int arr[] = new int[iSize];	//array creation
		
		System.out.println("Enter the starting Range:-");
		int iVal1 = sobj.nextInt();
		
		System.out.println("Enter the Ending Range:-");
		int iVal2 = sobj.nextInt();
		
		System.out.println("Enter the elements:-");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sobj.nextInt();
		}
		
		Range obj = new Range();
		
		obj.display(arr,iVal1,iVal2,iSize);
	}
}
		