abstract class A
{
	public void x()
	{
	System.out.println("X-A");
	}

}

abstract class B extends A
{
	public void x()
	{
	System.out.println("X-B");
	}
	
	public void y()
	{
	System.out.println("Y");	
	}
}

class C extends B
{
public void y()
	{
	super.y();	
	System.out.println("Y-c");	
	}
}

class Main 
{
	public static void main(String... args)
	{
		C obj=new C();
		obj.x();
		C obj1=new C();
		obj1.y();
		
	}
}


