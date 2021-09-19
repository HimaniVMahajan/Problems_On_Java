/* Accept N numbers from user and display all such elements which are divisible by 5. */

import java.lang.*;
import java.util.*;		//for Scanner class

class DivisibleByFive
{
	void display(int arr[])
	{
		if(arr == null)
		{
			return;
		}
		
		System.out.println("\nElements which are divisible by five:-\n");
		for(int i=0; i<arr.length; i++)
		{
			if((arr[i] % 5) == 0)
			{
				System.out.print(arr[i]+"\t");
			}
		}
	}
}

class Array
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
		
		DivisibleByFive dobj = new DivisibleByFive();
		
		 dobj.display(arr);
	}
}
		