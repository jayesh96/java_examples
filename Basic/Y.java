class X
{
	void A()
	{
		System.out.println("A");
	}

}
class Y extends X
{
	void B()
	{
		System.out.println("Method B");

	}
}

class Z extends Y
{
	void C()
	{
		System.out.println("Method C");
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

