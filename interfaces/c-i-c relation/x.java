interface x
{
	class X{
		System.out.println("Class X");
	}
}
interface y
{
	class Y{
		System.out.println("Class Y");
	}
}
interface z
{
	class Z{
		System.out.println("Class Z");
	}
}

public class P implements x,y,z{

	public void static main(String... args)
	{

		System.out.println("P");
	}
}