class A
{
public void x()
	{
	System.out.println("X");
	}

}
class B
{
try
{
	public static void main(String... args)
	{
	A o=new A();
	o.x();
	}
catch(Exception e)
		{
			e.printStackTrace();
					
		}

}
