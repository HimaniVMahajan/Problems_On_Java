/* Accept number from user and return Multiplication of all Digits. */

import java.lang.*;
import java.util.*;		//for Scanner class

class MultiplicationOfDigits
{
	int iMult = 1, iDigits = 0;
	
	int multiply(int iNo)
	{
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		while(iNo != 0)
		{
			iDigits = iNo % 10;
			iMult = iMult * iDigits;
			iNo = iNo / 10;
		}
		return iMult;
	}
}

class Demo20
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number:-");
		int iVal = sobj.nextInt();
		
		MultiplicationOfDigits mobj = new MultiplicationOfDigits();
		
		int iRet = mobj.multiply(iVal);
		
		System.out.println("Multiplication of all digits of a number is:"+iRet);
	}
}
		