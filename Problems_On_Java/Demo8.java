//Accept number from user and check whether that number is strong number or not.

import java.lang.*;
import java.util.*; 	//for scanner class

class CheckStrong
{
	boolean strong(int iNo)
	{
		int itemp = 0, iFact = 1, iDigits = 0, iSum = 0;
		itemp = iNo;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		if(iNo == 0)
		{
			return false;
		}
		
		while(iNo > 0)
		{
			iDigits = iNo % 10;
			while(iDigits > 0)
			{
				iFact = iFact * iDigits;
				iDigits--;
			}
			iSum = iSum + iFact;
			if(iSum > itemp)
			{
				break;
			}
			iNo = iNo / 10;
			iDigits = 0;
			iFact = 1;
		}
		
		if(iSum == itemp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
};

class Demo8
{
	public static void main(String args[])
	{
		boolean bret = false;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int iVal = sobj.nextInt();
		
		CheckStrong obj = new CheckStrong();
		
		bret = obj.strong(iVal);
		
		if(bret == true)
		{
			System.out.println("Number is strong");
		}
		else
		{
			System.out.println("Number is not strong");
		}
	}
};
		
		