import java.lang.*;

class Base
{
	public int i = 11;
	
	public Base(int x)
	{
		System.out.println("Base parameterised constructor");
	}
	
	public void fun()
	{
		System.out.println("Base fun");
		System.out.println(this.i);
	}
};

class Derived extends Base
{
	public int x = 21;
	
	public Derived()
	{
		super(11);
		System.out.println("Derived Constructor");
	}

	public void gun()
	{
		System.out.println(super.i);
		System.out.println(this.x);
		super.fun();
	}
};

class Demo2
{
	public static void main(String args[])
	{
		Derived dobj = new Derived();
		dobj.gun();
	}
};