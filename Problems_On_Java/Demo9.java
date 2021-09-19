//Accept the range from user and check whether that number is strong number or not from that range.

import java.lang.*;
import java.util.*;

class RangeStrong
{
	int iNo = 0, iDigits = 0, iSum = 0;
	//             0 1 2 3 4   5   6   7     8    9
	int iFact[] = {1,1,2,6,24,120,720,5040,40320,362880};
	
	
	void strongNumbers(int iStart,int iEnd)
	{
		System.out.println("Range of Strong Numbers:-\n");
		if(iStart <= 0 || iEnd <= 0)
		{
			return;
		}
		
		if(iStart > iEnd)
		{
			return;
		}
		
		for(int i=iStart; i<=iEnd; i++)
		{
			iNo = i;
			
			while(iNo != 0)
			{
				iDigits = iNo%10;
				if(iSum > i)
				{
					break;
				}
				iSum = iSum + iFact[iDigits];
				iNo = iNo/10;
			}
			
			if(iSum == i)
			{
				System.out.println(i);
			}
			iSum = 0;
		}
	}
};

class Demo9
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		RangeStrong robj = new RangeStrong();
		
		System.out.println("Enter the starting Range:-\t");
		int iS = sobj.nextInt();
		
		System.out.println("Enter the Ending Range:-\t");
		int iE = sobj.nextInt();
		
		robj.strongNumbers(iS,iE);
	}
};