//Application used to add two numbers.

import java.lang.*;
import java.util.*;

class Addition
{
	public int Add(int iNo1,int iNo2)
	{
		int iResult = iNo1 + iNo2;
		return iResult;
	}
};

class Demo10
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		Addition aobj = new Addition();
		
		System.out.println("Enter the first number:-\t");
		int iVal1 = sobj.nextInt();
		
		System.out.println("Enter the second number:-\t");
		int iVal2 = sobj.nextInt();
		
		int iRet = aobj.Add(iVal1,iVal2);
		
		System.out.println("Addition of two numbers is:"+iRet);
	}
};
		
		
		