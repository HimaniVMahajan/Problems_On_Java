//Accepting the Input using scanner class.

import java.lang.*;
import java.util.*;

class Demo5
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = sobj.nextLine();
		
		System.out.println("Enter your age:");
		int age = sobj.nextInt();
		
		System.out.println("Enter percentage:");
		float per = sobj.nextFloat();
		
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Percentage is:"+per);
	}
};