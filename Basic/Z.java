 class X
{	int a=5;
	private void A()
	{
		System.out.println("Method A"+a);
	}

}
class Y extends X
{	int b=10;
	protected void B()
	{	X obj=new X();
		obj.A();
		System.out.println("Method B");


	}
}

public class Z extends Y
{
	void C()
	{
		System.out.println("Method C" + b );
	}
	public static void main(String ... args)
	{
	Z ob=new Z();
	//ob.a();
	ob.C();
	ob.B();
	ob.A();
	}
}

