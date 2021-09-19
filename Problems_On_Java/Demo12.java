// Accept number from user and return its generic root.

import java.lang.*;
import java.util.*;

class GenericRoot
{
	int checkGenericRoot(int iNo)
	{
		int iSum1 = 0, iSum2 = 0;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		while(iNo != 0)
		{
			iSum1 = iSum1 + (iNo % 10);
			iNo = iNo / 10;
		}
		
		while(iSum1 != 0)
		{
			iSum2 = iSum2 + (iSum1 % 10);
			iSum1 = iSum1 / 10;
		}
		return iSum2;
	}
};
		
class Demo12
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		GenericRoot gobj = new GenericRoot();
		
		System.out.println("Enter the number:-\t");
		int iVal1 = sobj.nextInt();
		
		int iRet = gobj.checkGenericRoot(iVal1);
		
		System.out.println("Generic Root of a number is:"+iRet);
	}
};