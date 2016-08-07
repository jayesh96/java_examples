import java.lang.Thread;
class Thread2 extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{	
	try
	{
	Thread.sleep(1000);
	}
	catch(InterruptedException e)
	{
		System.out.println("sleep"+" "+e.getMessage());
		e.printStackTrace();
	}

	System.out.println("i= "+i);
}

}
}

public class Thread2Demo
{
	public static void main(String[] args)
	{
		Thread2 t1 = new Thread2();
		Thread t3 = new Thread(t1);
		Thread2 t2 = new Thread2();
		Thread t4 = new Thread(t2);		
		t1.start();
		try
		{		
		t2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Not Join"+" "+e.getMessage());
			e.printStackTrace();		
						
		}		
		t2.start();

	}
}


