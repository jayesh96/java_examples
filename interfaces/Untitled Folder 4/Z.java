interface x
{
	public void Hi();
	//public void Hello();	
}

abstract class XYZ implements x
{
	public void Hi();
	public void Bye();
}

class P extends XYZ
{
	public void Bye()
	{
		System.out.println("Bye");
	}
	public void Hi()
	{
		System.out.println("Hi");
	}

}

public class Z extends P
{
	public static void main(String... args)
	{
		P ob=new P();
		ob.Bye();
	}

}

