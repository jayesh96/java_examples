import java.lang.Thread;
class TableClass
{
	public void printtable(int n)
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println(n * i);
		}	
	}
}
class MyThread extends Thread
{
	TableClass t;
	MyThread(TableClass t)
	{
	this.t=t;
	}

	public void run()
	{
		t.printtable(5);
	}

}
class Main
{

public static void main(String[] args)
{
TableClass ob=new TableClass();
MyThread obj = new MyThread(ob);
obj.start();
}

}
