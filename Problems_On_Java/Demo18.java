/* Accept number from user and return the count of even digits. */

import java.lang.*;
import java.util.*;		//for Scanner class

class CheckEvenDigits
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
			if((iDigits % 2)== 0)
			{
				iCnt++;
			}
			iNo = iNo / 10;
		}
		return iCnt;
	}
}

class Demo18
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number:-");
		int iVal = sobj.nextInt();
		
		CheckEvenDigits cobj = new CheckEvenDigits();
		
		int iRet = cobj.display(iVal);
		
		System.out.println("Total number of Even Digits:"+iRet);
	}
}
		