/* Accept N numbers from user & also accept one another number and return the nearest  number to that number. */

import java.lang.*;
import java.util.*;

class Nearest
{
	int checkNearest(int iNo,int arr[])
	{
		
			
class Demo15
{
	public static void main(String args[])
	{	
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number of elements:-");
		int size = sobj.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements in array:");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sobj.nextInt();
		}
		
		System.out.println("Enter the number for find nearest:");
		int iVal = sobj.nextInt();
		
		Nearest nobj = new Nearest();
		int iRet = nobj.checkNearest(iVal,arr);
		
		System.out.println("Nearest number to that number is:\t"+iRet);
	}
}
