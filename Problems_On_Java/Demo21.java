/* Accept N numbers from user and accept one another number as NO, check whether NO is present or not. */

import java.lang.*;
import java.util.*;		//for Scanner class

class Search
{
	int i = 0;
	
	boolean searchElement(int arr[],int iNo,int iLen)
	{
		System.out.println("Length of array"+iLen);
		for(i=0; i<iLen; i++)
		{
			if(arr[i] == iNo)
			{
				break;
			}
		}
		
		if(arr[i] == iNo)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Demo21
{
	public static void main(String args[])
	{
		boolean bRet = false;
		
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
		
		bRet = obj.searchElement(arr,iVal,iSize);
		
		if(bRet == true)
		{
			System.out.println("Element is present in array");
		}
		else
		{
			System.out.println("Element is not present in array");
		}
	}
}
		