//Write a program which calculate the even factorial of number.

import java.lang.*;
import java.util.*;

class Factorial
{
	int calculateFact(int iNo)
	{
		int iFact = 1, iCnt = 2;
		
		while(iCnt <= iNo)
		{
			iFact = iFact * iCnt;
			iCnt = iCnt + 2;
		}
		return iFact;
	}
};
		
class Demo11
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		Factorial fobj = new Factorial();
		
		System.out.println("Enter the number:-\t");
		int iVal1 = sobj.nextInt();
		
		int iRet = fobj.calculateFact(iVal1);
		
		System.out.println("Even Factorial of a numbers is:"+iRet);
	}
};