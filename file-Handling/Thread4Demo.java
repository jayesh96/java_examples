import java.lang.Thread;
class Thread4 implements Runnable
{
	public void run()
	{
	for(int i=0;i<5;i++)
	{	
	/*try
	{
		Thread.sleep(1000);
	}
	catch(InterruptedException e)
	{
		System.out.println("sleep"+" "+e.getMessage());
		e.printStackTrace();
	}*/

	System.out.println("i= "+i);
	}
	}
}

public class Thread4Demo
{
	public static void main(String[] args)
	{
		Thread2 t1 = new Thread2();
		Thread t2 = new Thread(t1);
		t2.start();

	}
}


