//Accept number from user and check whether that number is armstrong number or not.

import java.lang.*;
import java.util.*;

class Armstrong
{
	boolean checkArmstrong(int iNo)
	{
		int itemp1 = 0, itemp2 = 0, iCnt = 0, iSum = 0;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		itemp1 = iNo;
		itemp2 = iNo;
		
		while(iNo != 0)
		{
			if((iNo % 10) >= 0)
			{
				iCnt++;
			}
			iNo = iNo / 10;
		}
		
		while(itemp1 != 0)
		{
			int iDigits = itemp1 % 10;
			iSum = iSum + iDigits * iDigits * iDigits;
			itemp1 = itemp1 / 10;
		}
		
		if(iSum == itemp2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
					
class Demo13
{
	public static void main(String args[])
	{
		boolean bRet = false;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number:-");
		int iVal = sobj.nextInt();
		
		Armstrong aobj = new Armstrong();
		bRet = aobj.checkArmstrong(iVal);
		
		if(bRet == true)
		{
			System.out.println("Number is Armstrong Number");
		}
		else
		{
			System.out.println("Number is not a Armstrong Number");
		}
	}
}
		
		