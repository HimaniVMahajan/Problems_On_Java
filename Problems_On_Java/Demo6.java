import java.lang.*;

class Demo6
{
	public static void main(String args[])
	{
		int j = 11;
		
		Integer iobj = j;			//AutoBoxing
		
		System.out.println(j);
		System.out.println(iobj);
		
		int i = iobj;				//Auto Unboxing
		
		System.out.println(i);
	}
};