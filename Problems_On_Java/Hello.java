import java.lang.*;

class MyInteger
{
	public int no;
	
	public MyInteger(int x)
	{
		this.no = x;
	}
};

class Demo
{

	public void swap(MyInteger x,MyInteger y)
	{
		MyInteger temp = new MyInteger(0);
		
		temp.no = x.no;
		x.no = y.no;
		y.no = temp.no;
	}	
};

class Hello
{
	public static void main(String args[])
	{
		Demo obj = new Demo();
		
		MyInteger obj1 = new MyInteger(11);
		MyInteger obj2 = new MyInteger(21);
		
		System.out.println("Before swap"+obj1.no  +obj2.no);
		
		obj.swap(obj1,obj2);
		
		System.out.println("After swap"+obj1.no  +obj2.no);
	}
};