//Interface in Java

import java.lang.*;

interface RBI
{
	int Amount = 100000;			//public,static,final
	double LoanIntrest();
	double FDIntrest();
}

class SBI implements RBI
{
	public double LoanIntrest()
	{
		return 5.2;
	}
	
	public double FDIntrest()
	{
		return 4.2;
	}
};

class BOI implements RBI
{
	public double LoanIntrest()
	{
		return 6.2;
	}
	
	public double FDIntrest()
	{
		return 5.2;
	}
};

class Demo4
{
	public static void main(String args[])
	{
		//RBI robj = new RBI();
		
		SBI sobj = new SBI();
		BOI bobj = new BOI();
		
		System.out.println(sobj.LoanIntrest());
		System.out.println(sobj.FDIntrest());
		
		System.out.println(bobj.LoanIntrest());
		
		System.out.println(sobj.Amount);
		System.out.println(bobj.Amount);
		
		//sobj.Amount++;
		System.out.println(RBI.Amount);
	}
};