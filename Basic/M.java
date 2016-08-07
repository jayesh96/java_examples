import java.util.Scanner;
class X
{
	public void X()
	{
		System.out.println("X");

	}
}

class Y exceeds X
{
	public void Y()
	{
		System.out.println("Y");
	}
}
class Main
{
	public static void main(String args[])
	{
		Y ob=new Y();
		ob.X();
		ob.Y();
		
	}
}