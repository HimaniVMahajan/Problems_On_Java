//Accept the number from user and display the fibonascci series till that number.

import java.lang.*;
import java.util.*;

class Fibonascci
{
	void displayFibonascciSeries(int iNo)
	{
		int First = 0, Second = 1, Third = 0;
		
		System.out.println("\n"+"Fibonascci Series:-"+"\n");
		for( ; First<=iNo; )
		{
			System.out.print(First+"\t");
			Third = First + Second;
			First = Second;
			Second = Third;
		}
	}
}
			
class Demo14
{
	public static void main(String args[])
	{	
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number:-");
		int iVal = sobj.nextInt();
		
		Fibonascci fobj = new Fibonascci();
		fobj.displayFibonascciSeries(iVal);
	}
}