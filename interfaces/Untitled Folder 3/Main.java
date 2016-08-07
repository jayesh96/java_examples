interface x
{
	public void X();
}

interface y
{
	public void Y();
}

interface z extends x,y
{
	public void Z();
}

class A implements z
{
	public void Z()
	{
	System.out.println("Z");
	}
	public void X()
	{
	System.out.println("X");		
	}
	public void Y()
	{
	System.out.println("Y");	
	}
		
	
	
}

class Main
{
	public static void main(String... args)
	{
		A o=new A();
		o.Z();
		}
}
