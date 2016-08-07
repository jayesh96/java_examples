import java.lang.Thread;
class Threadworm extends Thread
{

	public void run()
	{
	for(int i=1;i<=5;i++)
	{
	System.out.println(Thread.currentThread().getPriority());	
	System.out.println(Thread.currentThread().getName());
	try{
		Thread.sleep(1000);
	}	

	}
	}
}

class Main
{

public static void main(String[] args)
{
Threadworm ob = new Threadworm();
ob.setPriority(Thread.MIN_PRIORITY);
ob.setName("Jayesh");
ob.start();
Threadworm ob1 = new Threadworm();
ob1.setPriority(Thread.MAX_PRIORITY);
ob1.setName("Jayesh_next");
ob1.start();

}
}
