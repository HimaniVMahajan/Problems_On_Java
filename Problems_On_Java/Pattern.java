/* Write a program which displays below pattern
   Input : 6	6	


	&	*	*	*	*	*
	*	&	1	2	3	*
	*	A	&	4	5	*
	*	B	C	&	6	*
	*	D	E	F	&	*
	*	*	*	*	*	&
	
*/

import java.lang.*;
import java.util.*;

class DisplayPattern
{
	void display(int iRows, int iCols)
	{
		char c = 'A';
		int iCnt = 1;
		
		if(iRows < 0 || iCols < 0)
		{
			iRows = -iRows;
			iCols = -iCols;
		}
		
		System.out.println();
		for(int i=1; i<=iRows; i++)
		{
			for(int j=1; j<=iCols; j++)
			{
				if(i == j)
				{
					System.out.print("&\t");
				}
				else if(i == 1 || j==1 || i==iRows || j==iCols)
				{
					System.out.print("*\t");
				}
				else if(i > j)
				{
					System.out.print(c+"\t");
					c++;
				}
				else if(i < j)
				{
					System.out.print(iCnt+"\t");
					iCnt++;
				}
			}
			System.out.println();
		}
	}
}

class Pattern
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number of Rows:-");
		int iVal1 = sobj.nextInt();
		
		System.out.println("Enter the number of Columns:-");
		int iVal2= sobj.nextInt();
		
		DisplayPattern dobj = new DisplayPattern();
		dobj.display(iVal1,iVal2);
	}
}
		
		