/* Accept N numbers from user and display all such elements which are Multiples of 11. */

import java.lang.*;
import java.util.*;		//for Scanner class

class MultiplesOfEleven
{
	void display(int arr[])
	{
		if(arr == null)
		{
			return;
		}
		
		System.out.println("\nElements which are Multiples of Eleven:-\n");
		for(int i=0; i<arr.length; i++)
		{
			if((arr[i] % 11) == 0)
			{
				System.out.print(arr[i]+"\t");
			}
		}
	}
}

class Demo17
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
		
		MultiplesOfEleven mobj = new MultiplesOfEleven();
		
		mobj.display(arr);
	}
}
		