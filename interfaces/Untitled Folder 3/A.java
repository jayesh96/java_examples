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

public class Main implements z
{
	public static void main(String... args)
	{
		public void X()
		{
		}
		public void Y()
		{
		}
		public void Z()
		{
		}
	}
}
