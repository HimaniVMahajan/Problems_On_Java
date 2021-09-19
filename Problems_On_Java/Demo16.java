/* Accept N numbers from user and return difference between summation of even elements and summation of odd elements. */

import java.lang.*;
import java.util.*;		//for Scanner class

class Difference
{
	int iSum1 = 0, iSum2 = 0, iDiff = 0;
	
	int checkDifference(int arr[])
	{
		if(arr == null)
		{
			return -1;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			if((arr[i] % 2) == 0)
			{
				iSum1 = iSum1 + arr[i];
			}
			else
			{
				iSum2 = iSum2 + arr[i];
			}
		}
		
		return(iDiff = iSum1 - iSum2);
	}
}

class Demo16
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("How many elements you want to be entered in array:-");
		int iSize = sobj.nextInt();
		
		int arr[] = new int[iSize];	//array creation
		
		System.out.println("Enter the elements:-");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sobj.nextInt();
		}
		
		Difference dobj = new Difference();
		
		int iRet = dobj.checkDifference(arr);
	
		System.out.println("Difference between summation of even and odd elements:\t"+iRet);
	}
}
		