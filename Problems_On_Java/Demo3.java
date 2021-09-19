import java.lang.*;

class Hello
{
	public int i;
	public static int j;
	
	static
	{
		System.out.println("Inside first static block");
	}
	
	static
	{
		System.out.println("Inside second static block");
		j = 21;
	}
	
	public Hello()
	{
		System.out.println("Inside Hello constructor");
		i = 11;
	}
	
	public void fun()
	{
		System.out.println("Inside fun");
	}
	
	public static void gun()
	{
		System.out.println("Inside gun");
	}
};

class Demo3
{
	static
	{
		System.out.println("Inside static of Demo class");
	}
	
	public static void main(String args[])
	{
		System.out.println("Inside main");
		
		System.out.println(Hello.j);
		
		Hello hobj = new Hello();
		hobj.fun();
		
		System.out.println(Hello.j);
		Hello.gun();
	}
};
	
	