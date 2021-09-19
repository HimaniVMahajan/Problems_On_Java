/* Accept N numbers from user and return product of all odd elements.*/

import java.lang.*;
import java.util.*;		//for Scanner class

class Product
{
	int i = 0, iProduct = 1;
	
	int display(int arr[],int iLen)
	{
		System.out.println();
		for(i=0; i<iLen; i++)
		{
			if((arr[i] % 2) != 0)
			{
				iProduct = iProduct * arr[i];
			}
		}
		return iProduct;
	}
}

class Demo25
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
		
		Product obj = new Product();
		
		iRet = obj.display(arr,iSize);
		
		System.out.println("Product of all odd elements:"+iRet);
	}
}
		