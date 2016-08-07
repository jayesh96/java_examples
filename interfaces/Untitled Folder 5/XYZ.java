interface m
{
	public void hi();
}

interface n //extends m
{
	public void hello();
}

class x implements m,n
{
	public void hi()
	{
	System.out.println("hi");	
	}
	public void hello()
	{
	System.out.println("hello");
	}

}

class XYZ extends x
{
	public static void main(String... args)
	{
		x obj=new x();	
		obj.hi();
		obj.hello();	
	}
}















