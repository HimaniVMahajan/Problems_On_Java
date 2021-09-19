/* Accept number from user and return the count of digits in between 3 and 7. */

import java.lang.*;
import java.util.*;		//for Scanner class

class CountRange
{
	int iCnt = 0, iDigits = 0;
	
	int display(int iNo)
	{
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		while(iNo != 0)
		{
			iDigits = iNo % 10;
			if((iDigits>= 3) && (iDigits<=7))
			{
				iCnt++;
			}
			iNo = iNo / 10;
		}
		return iCnt;
	}
}

class Demo19
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number:-");
		int iVal = sobj.nextInt();
		
		CountRange cobj = new CountRange();
		
		int iRet = cobj.display(iVal);
		
		System.out.println("Total number of Digits in that Range:"+iRet);
	}
}
		