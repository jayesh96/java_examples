class X
{
	public void X()
	{
		System.out.println("X");

	}
	public void A()
	{
		System.out.println("A");

	}
}

class Y extends X
{
	public void Y()
	{
		System.out.println("Y");

	}
	public void B()
	{
		System.out.println("B");

	}
public void C()
	{
		System.out.println("C");

	}

}
class Z extends Y
{
	public void Z()
	{
		System.out.println("Y");

	}
	public void D()
	{
		System.out.println("D");

	}
public void E()
	{
		System.out.println("E");

	}
public void F()
	{
		System.out.println("F");

	}


}
class Main
{
	public static void main(String args[])
	{
		Z ob=new Z();
		ob.A();
		ob.B();
		ob.C();
		ob.D();
		ob.E();
		ob.F();
		ob.X();
		ob.Y();

	}
}