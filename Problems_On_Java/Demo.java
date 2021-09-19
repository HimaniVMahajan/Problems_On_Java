import java.lang.*;

class Arithmetic
{
	public int no1;
	public int no2;
	public int no3;
	
	Arithmetic()
	{
		this.no1 = 0;
		this.no2 = 0;
	}
	
	Arithmetic(int x,int y)
	{
		no1 = x;
		no2 = y;
	}
	
	Arithmetic(int x,int y,int z)
	{
		no1 = x;
		no2 = y;
		no3 = z;
	}
	
	public int Add(int no1,int no2)
	{
		return no1 + no2;
	}
	
	public int Add(int no1,int no2,int no3)
	{
		return no1+no2+no3;
	}
};
	
class Demo
{
	public static void main(String args[])
	{
		Arithmetic obj = new Arithmetic(11,21);
		
		int ret = obj.Add(10,20);
		System.out.println("Addition of two no is: "+ret);
		
		int ret1 = obj.Add(10,20,10);
		System.out.println("Addition of three no is: "+ret1);
	}
};

