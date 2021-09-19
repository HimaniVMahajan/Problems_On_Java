/* Accept N numbers from user and accept one another number as NO, return index of last occurence of that NO. */

import java.lang.*;
import java.util.*;		//for Scanner class

class Search
{
	int i = 0, iCnt = 0;
	
	int searchIndex(int arr[],int iNo,int iLen)
	{
		for(i=0; i<iLen; i++)
		{
			if(arr[i] == iNo)
			{
				iCnt = i;
			}
		}
		return iCnt;
	}
}

class Demo23
{
	public static void main(String args[])
	{
		int iRet = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("How many elements you want to be entered in array:-");
		int iSize = sobj.nextInt();
		
		int arr[] = new int[iSize];	//array creation
		
		System.out.println("Enter the elements:-");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sobj.nextInt();
		}
		
		System.out.println("Enter the number that you want to search:-");
		int iVal = sobj.nextInt();
		
		Search obj = new Search();
		
		iRet = obj.searchIndex(arr,iVal,iSize);
		
		System.out.println("Index of last occurence of that Number is:"+iRet);
	}
}
		