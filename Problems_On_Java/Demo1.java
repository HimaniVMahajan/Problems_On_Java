import java.lang.*;

class Base
{
	
	public int i = 11;
	public int j = 21;
	
	public Base()
	{
		System.out.println("Base constructor");
	}
	
	public void fun()
	{
		System.out.println("Base fun");
	}
};

class Derived extends Base
{
	
	public int x = 51;
	
	public Derived()
	{
		System.out.println("Derived constructor");
	}
	
	public void fun()
	{
		System.out.println("Derived fun");
		
		//super.fun();
		
		System.out.println("Value of Base i: "+super.i);
		System.out.println("Value of Derived x: "+this.x);
	}
	
	public void gun()
	{
		System.out.println("Derived gun");
	}
};

class Demo1
{
	public static void main(String args[])
	{
		Base bobj = new Base();
		
		Derived dobj = new Derived();
		
		bobj.fun();
		dobj.fun();
		
		Base bref = new Derived();
		
		bref.fun();
	}
}