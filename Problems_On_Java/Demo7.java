//Application program of multithreading.

import java.lang.*;

class Multi extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Inside run Method for thread with id"+Thread.currentThread().getId());
		
			for(int i=1; i<=5; i++)
			{
				System.out.println("Inside thread "+Thread.currentThread().getId()+""+i);
			
				Thread.sleep(1000);
			}
		}
		catch(Exception obj)
		{
			System.out.println("Exception Occured in threading");
		}
	}
};

class Demo7
{
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		
		Multi mobj1 = new Multi();
		Thread t1 = new Thread(mobj1);
		
		Multi mobj2 = new Multi();
		Thread t2 = new Thread(mobj1);
		
		Multi mobj3 = new Multi();
		Thread t3 = new Thread(mobj1);
		
		t1.start();
		t2.start();
		t3.start();
	}
};