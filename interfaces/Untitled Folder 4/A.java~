interface x
{
	public void A();
	public void B();
	public void C();
	public void D();
}

abstract class XYZ implements x
{
	public void A()
	{
	System.out.println("A");
	}
	public void E()
	{
	System.out.println("E");
	}
}

class P extends XYZ
{
	public void B()
	{}
	public void C()
	{}
	public void D()
	{
	System.out.println("D");	
	}
}

public class A extends P
{
public static void main(String... args)
{
 P obj=new P();
	obj.D();
}
}

